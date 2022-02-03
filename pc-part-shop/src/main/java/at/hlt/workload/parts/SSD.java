package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"SSD\"")
public class SSD extends Storage{
    String interfaceType;
}
