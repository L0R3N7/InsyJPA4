package at.htl.model;

import java.io.Serializable;

public class RAMDTO extends PartDTO implements Serializable {
    Long memory;
    Long count;
    Double clock;
    String ddr;

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
