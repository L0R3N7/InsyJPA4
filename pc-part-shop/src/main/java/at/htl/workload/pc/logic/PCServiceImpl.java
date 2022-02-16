package at.htl.workload.pc.logic;

import at.htl.model.NewPCDTO;
import at.htl.workload.parts.Part;
import at.htl.workload.parts.logic.PartRepo;
import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.PCPart;
import at.htl.workload.pc.PCPartId;
import at.htl.workload.pc.PrebuiltPC;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ApplicationScoped
public class PCServiceImpl implements PCService {

    private final PCRepo pcRepo;
    private final PartRepo partRepo;
    //private final List<String> requiredParts = List.of("Case", "CPU", "GraphicsCard", "Motherboard", "Storage", "PSU", "RAM");

    public PCServiceImpl(PCRepo pcRepo, PartRepo partRepo) {
        this.pcRepo = pcRepo;
        this.partRepo = partRepo;
    }

    @Override
    public List<PrebuiltPC> getAllPrebuilt() {
        return pcRepo.getAllPrebuilt();
    }

    @Override
    @Transactional
    public ConfiguredPC configurePC(NewPCDTO dto) {
        List<PCPart> parts = new ArrayList<>();
        //List<String> types = List.copyOf(requiredParts);
        Set<String> requiredParts = new HashSet<>();
        ConfiguredPC pc = new ConfiguredPC();
        pc.setPrice(BigDecimal.ZERO);

        for (String serialNumber : dto.getPartSerialnumbers()) {
            Part p = partRepo.getEntityManager()
                    .createQuery("select p from Part p where p.serialNumber = :sn", Part.class)
                    .setParameter("sn", serialNumber)
                    .getResultList().stream().findFirst().orElse(null);
            if (p == null) {
                return null;
            }
            requiredParts.add(p.getType()); 
            //types.remove(types.indexOf(p.getType()));

            PCPartId id = new PCPartId();
            id.setPart(p);
            PCPart pcPart = new PCPart();
            pcPart.setId(id);
            pcPart.setAmount(1L);
            parts.add(pcPart);


            pc.setPrice(pc.getPrice().add(p.getPrice().multiply(BigDecimal.valueOf((pcPart.getAmount())))));
        }

        if (requiredParts.size() != 7) {
            return null;
        }

        pc.setShouldBeBuilt(dto.isShouldBeBuilt());
        pc.setWarrantyEnd(LocalDate.now().plusYears(1));

        pcRepo.persist(pc);

        parts.forEach(pcPart -> {
            pcPart.getId().setConfiguredPC(pc);
            pcRepo.getEntityManager().merge(pcPart);
        });

        return pc;
    }

    @Override
    public List<ConfiguredPC> getAllConfigured() {
        return this.pcRepo.getAllConfigured();
    }
}
