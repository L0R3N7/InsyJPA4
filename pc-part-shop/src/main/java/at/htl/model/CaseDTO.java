package at.htl.model;

import java.io.Serializable;

public class CaseDTO extends PartDTO implements Serializable {
    Double depth;
    Double width;
    Double height;
    String formFactor;
    Long fanCount;

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public Long getFanCount() {
        return fanCount;
    }

    public void setFanCount(Long fanCount) {
        this.fanCount = fanCount;
    }
}
