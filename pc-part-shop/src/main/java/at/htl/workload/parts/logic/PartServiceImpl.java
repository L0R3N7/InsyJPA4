package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;

import javax.enterprise.context.ApplicationScoped;
import java.util.Map;

@ApplicationScoped
public class PartServiceImpl implements PartService {
    private final PartRepo partRepo;

    public PartServiceImpl(PartRepo partRepo) {
        this.partRepo = partRepo;
    }

    @Override
    public Map<String, Part> getAll() {
        
    }
}
