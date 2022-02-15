package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;
import at.htl.model.PartDTO;

import java.util.List;
import java.util.Map;

public interface PartService {
    Map<String, List<PartDTO>> getAll();
    Part getById(String serialNumber);
}
