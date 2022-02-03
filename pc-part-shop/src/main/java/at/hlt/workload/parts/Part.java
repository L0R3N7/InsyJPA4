package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "\"Part\"")
public abstract class Part {
    @Id
    @Column(name = "serialnumber")
    String serialNumber;
    String name;
    BigDecimal price;
}
