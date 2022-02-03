package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"Case\"")
public class Case extends Part{
    Double depth;
    Double width;
    Double height;
    String formFactor;
    Long fanCount;
}
