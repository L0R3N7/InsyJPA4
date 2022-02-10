package at.htl.workload.pc.logic;

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
}
