package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"RAM\"")
public class RAM extends Part{
    Long memory;
    Long count;
    Double clock;
    String type;
}
