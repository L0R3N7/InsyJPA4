package at.htl.workload.parts.logic;

import at.htl.workload.parts.Part;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PartRepoImpl implements PartRepo {
    @Override
    public List<Part> getAllByType(String type) {
        var query = getEntityManager()
                .createQuery("select p as partList from Part p where upper(p.type) like upper(:type) ", Part.class)
                .setParameter("type", type);
        return query.getResultStream().collect(Collectors.toList());
    }

    @Override
    public Part getByIdInheritance(String serialNumber, String type) {
        var query = getEntityManager().createQuery("select x from " + type + " x where x.serialNumber = :sn");
        query.setParameter("sn", serialNumber);
        return (Part) query.getResultStream().findFirst().orElse(null);
    }
}
