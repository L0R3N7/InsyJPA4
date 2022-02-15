package at.htl.workload.parts.logic;

import at.htl.mapper.GlobalMapper;
import at.htl.model.PartDTO;
import at.htl.workload.parts.Part;

import javax.enterprise.context.ApplicationScoped;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ApplicationScoped
public class PartServiceImpl implements PartService {
    private final PartRepo partRepo;
    private final List<String> types = List.of("Case", "CPU", "GraphicsCard", "Motherboard", "Storage", "PSU", "RAM");

    public PartServiceImpl(PartRepo partRepo) {
        this.partRepo = partRepo;
    }

    @Override
    public Map<String, List<PartDTO>> getAll() {
        Map<String, List<PartDTO>> result = new HashMap<>();

        for (String type : types){
            var queryResult = this.partRepo.getAllByType(type);
            result.put(type, GlobalMapper.INSTANCE.listPartToDto(queryResult));
        }

        return result;
    }

    @Override
    public Part getById(String serialNumber) {
        var basePart = this.partRepo.findById(serialNumber);
        if (basePart == null) {
            return null;
        }
        var part = this.partRepo.getByIdInheritance(serialNumber, basePart.getType());
        return part;
    }
}
