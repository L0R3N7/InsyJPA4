package at.htl.workload.parts.logic;

import at.htl.workload.parts.PartDto;

import java.util.List;
import java.util.Map;

public interface PartService {
    Map<String, List<PartDto>> getAll();
}
