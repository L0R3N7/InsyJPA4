package at.htl.workload.pc;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ConfiguredPC extends PC{
    @JsonIgnore
    @OneToMany(
            mappedBy = "id.configuredPC",
            cascade = CascadeType.ALL
    )
    List<PCPart> pcParts = new ArrayList<>();
    Boolean shouldBeBuilt;

    public ConfiguredPC() {
    }

    public List<PCPart> getPcParts() {
        return pcParts;
    }

    public void setPcParts(List<PCPart> PCParts) {
        this.pcParts = PCParts;
    }

    public Boolean getShouldBeBuilt() {
        return shouldBeBuilt;
    }

    public void setShouldBeBuilt(Boolean shouldBeBuilt) {
        this.shouldBeBuilt = shouldBeBuilt;
    }
}
