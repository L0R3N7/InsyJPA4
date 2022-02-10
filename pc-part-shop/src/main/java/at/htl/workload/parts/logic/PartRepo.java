package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public interface PartRepo extends PanacheRepository<Part> {
}
