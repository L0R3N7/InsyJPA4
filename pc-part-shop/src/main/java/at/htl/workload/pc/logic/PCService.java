package at.htl.workload.pc.logic;

import at.htl.model.NewPCDTO;
import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.PrebuiltPC;

import java.util.List;

public interface PCService {
    List<PrebuiltPC> getAllPrebuilt();

    ConfiguredPC configurePC(NewPCDTO dto);
}
