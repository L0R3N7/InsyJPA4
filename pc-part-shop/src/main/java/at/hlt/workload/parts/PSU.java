package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"PSU\"")
public class PSU extends Part{
    Long power;
    String rating;
}
