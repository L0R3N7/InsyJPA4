package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"CPU\"")
public class CPU extends Part{
    Long coreCount;
    Long threadCount;
    Double baseClock;
    Double boostClock;
    String cpuSocket;
    Boolean includedCooler;
}
