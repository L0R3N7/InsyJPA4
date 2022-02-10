package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;

import java.util.Map;

public interface PartService {
    Map<String, Part> getAll();
}
