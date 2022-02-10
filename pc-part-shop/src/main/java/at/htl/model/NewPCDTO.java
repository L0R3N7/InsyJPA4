package at.htl.model;

import java.util.List;

public class NewPCDTO {
    List<String> partIds;
    boolean shouldBeBuilt;

    public NewPCDTO() {
    }

    public List<String> getPartIds() {
        return partIds;
    }

    public void setPartIds(List<String> partIds) {
        this.partIds = partIds;
    }

    public boolean isShouldBeBuilt() {
        return shouldBeBuilt;
    }

    public void setShouldBeBuilt(boolean shouldBeBuilt) {
        this.shouldBeBuilt = shouldBeBuilt;
    }
}
