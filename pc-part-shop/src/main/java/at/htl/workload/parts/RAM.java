package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"RAM\"")
public class RAM extends Part{
    Long memory;
    Long count;
    Double clock;
    String ddr;

    public RAM() {
    }

    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Double getClock() {
        return clock;
    }

    public void setClock(Double clock) {
        this.clock = clock;
    }

    public String getDdr() {
        return ddr;
    }

    public void setDdr(String ddr) {
        this.ddr = ddr;
    }
}
