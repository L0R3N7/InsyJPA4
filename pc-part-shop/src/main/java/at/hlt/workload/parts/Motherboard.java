package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"Motherboard\"")
public class Motherboard extends Part{
    String formFactor;
    Long memoryLanes;
    String chipSet;
    String socket;
}
