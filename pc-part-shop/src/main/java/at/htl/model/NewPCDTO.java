package at.htl.model;

import java.util.List;

public class NewPCDTO {
    List<String> partSerialnumbers;
    boolean shouldBeBuilt;

    public NewPCDTO() {
    }

    public List<String> getPartSerialnumbers() {
        return partSerialnumbers;
    }

    public void setPartSerialnumbers(List<String> partSerialnumbers) {
        this.partSerialnumbers = partSerialnumbers;
    }

    public boolean isShouldBeBuilt() {
        return shouldBeBuilt;
    }

    public void setShouldBeBuilt(boolean shouldBeBuilt) {
        this.shouldBeBuilt = shouldBeBuilt;
    }
}
