package at.htl.workload.parts;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"GraphicsCard\"")
public class GraphicsCard extends Part{
    Long VRAM;
    String VRAMType;
    Long TDP;
    Double baseClock;
    Double boostClock;

    public GraphicsCard() {
    }

    public Long getVRAM() {
        return VRAM;
    }

    public void setVRAM(Long VRAM) {
        this.VRAM = VRAM;
    }

    public String getVRAMType() {
        return VRAMType;
    }

    public void setVRAMType(String VRAMType) {
        this.VRAMType = VRAMType;
    }

    public Long getTDP() {
        return TDP;
    }

    public void setTDP(Long TDP) {
        this.TDP = TDP;
    }

    public Double getBaseClock() {
        return baseClock;
    }

    public void setBaseClock(Double baseClock) {
        this.baseClock = baseClock;
    }

    public Double getBoostClock() {
        return boostClock;
    }

    public void setBoostClock(Double boostClock) {
        this.boostClock = boostClock;
    }
}
