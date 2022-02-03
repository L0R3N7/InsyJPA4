package at.hlt.workload.pc;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class PCPart {
    @EmbeddedId
    PCPartId id;
    Long amount;
}
