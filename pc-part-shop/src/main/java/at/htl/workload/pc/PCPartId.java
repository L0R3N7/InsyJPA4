package at.htl.workload.pc;

import at.htl.workload.parts.Part;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class PCPartId implements Serializable {
    @ManyToOne
    ConfiguredPC configuredPC;
    @ManyToOne
    Part part;

    public PCPartId() {
    }

    public ConfiguredPC getConfiguredPC() {
        return configuredPC;
    }

    public void setConfiguredPC(ConfiguredPC configuredPC) {
        this.configuredPC = configuredPC;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
