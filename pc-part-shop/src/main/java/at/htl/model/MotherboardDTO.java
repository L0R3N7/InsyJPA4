package at.htl.model;

import java.io.Serializable;

public class MotherboardDTO extends PartDTO implements Serializable {
    String formFactor;
    Long memoryLanes;
    String chipSet;
    String socket;

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
