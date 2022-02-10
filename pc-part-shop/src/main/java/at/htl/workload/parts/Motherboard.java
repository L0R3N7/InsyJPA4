package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"Motherboard\"")
public class Motherboard extends Part{
    String formFactor;
    Long memoryLanes;
    String chipSet;
    String socket;

    public Motherboard() {
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public Long getMemoryLanes() {
        return memoryLanes;
    }

    public void setMemoryLanes(Long memoryLanes) {
        this.memoryLanes = memoryLanes;
    }

    public String getChipSet() {
        return chipSet;
    }

    public void setChipSet(String chipSet) {
        this.chipSet = chipSet;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }
}
