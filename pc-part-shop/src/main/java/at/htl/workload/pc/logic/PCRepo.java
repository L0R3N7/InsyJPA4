package at.htl.workload.pc.logic;

import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.PC;
import at.htl.workload.pc.PrebuiltPC;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.List;

public interface PCRepo extends PanacheRepository<PC> {
    List<PrebuiltPC> getAllPrebuilt();

    List<ConfiguredPC> getAllConfigured();
}
