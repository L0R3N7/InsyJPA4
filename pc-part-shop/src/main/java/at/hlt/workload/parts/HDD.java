package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "\"HDD\"")
public class HDD extends Storage{
    Long RPM;
}
