package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"GraphicsCard\"")
public class GraphicsCard extends Part{
    Long VRAM;
    String VRAMType;
    Long TDP;
    Double baseClock;
    Double boostClock;
}
