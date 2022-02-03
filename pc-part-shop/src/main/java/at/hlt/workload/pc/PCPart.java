package at.hlt.workload.pc;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"PCPart\"")
public class PCPart {
    @EmbeddedId
    PCPartId id;
    Long amount;
}
