package at.hlt.workload.pc;

import at.hlt.workload.parts.Part;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class PCPartId implements Serializable {
    @ManyToOne
    ConfiguredPC configuredPC;
    @ManyToOne
    Part part;
}
