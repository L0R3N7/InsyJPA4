package at.htl.workload.pc;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"PCPart\"")
public class PCPart {
    @EmbeddedId
    PCPartId id;
    Long amount;

    public PCPart() {
    }

    public PCPartId getId() {
        return id;
    }

    public void setId(PCPartId id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
