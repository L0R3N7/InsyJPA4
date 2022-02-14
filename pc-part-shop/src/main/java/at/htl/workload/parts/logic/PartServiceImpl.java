package at.htl.workload.parts.logic;

import at.htl.mapper.GlobalMapper;
import at.htl.workload.parts.Part;
import at.htl.workload.parts.PartDto;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ApplicationScoped
public class PartServiceImpl implements PartService {
    private final PartRepo partRepo;
    private final List<String> types = List.of("Case", "CPU", "GraphicsCard", "Motherboard", "Storage", "PSU", "RAM");

    public PartServiceImpl(PartRepo partRepo) {
        this.partRepo = partRepo;
    }

    @Override
    public Map<String, List<PartDto>> getAll() {
        Map<String, List<PartDto>> result = new HashMap<>();

        for (String type : types){
            var query = this.partRepo.getEntityManager()
                    .createQuery("select p as partList from Part p where upper(p.type) like upper(:type) ", Part.class)
                    .setParameter("type", type);
            var queryResult = query.getResultStream().collect(Collectors.toList());
            result.put(type, GlobalMapper.INSTANCE.listPartToDto(queryResult));
        }

        return result;
    }
}
