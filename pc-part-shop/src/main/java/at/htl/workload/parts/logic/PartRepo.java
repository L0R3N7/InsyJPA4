package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import java.util.List;

public interface PartRepo extends PanacheRepositoryBase<Part, String> {
    List<Part> getAllByType(String type);
    Part getByIdInheritance(String serialNumber, String type);
}
