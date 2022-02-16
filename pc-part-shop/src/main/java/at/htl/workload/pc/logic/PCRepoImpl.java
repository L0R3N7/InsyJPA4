package at.htl.workload.pc.logic;

import at.htl.workload.pc.ConfiguredPC;
import at.htl.workload.pc.PrebuiltPC;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PCRepoImpl implements PCRepo {

    @Override
    public List<PrebuiltPC> getAllPrebuilt() {
        var q = getEntityManager().createQuery("select p from PrebuiltPC p where p.customer is null", PrebuiltPC.class);
        return q.getResultList();
    }

    @Override
    public List<ConfiguredPC> getAllConfigured() {
        var q = getEntityManager().createQuery("select p from ConfiguredPC p where p.customer is null", ConfiguredPC.class);
        return q.getResultList();
    }
}
