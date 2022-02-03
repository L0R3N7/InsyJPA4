package at.hlt.workload.customer;

import at.hlt.workload.pc.PC;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "\"Customer\"")
public class Customer {
    @Id
    Long id;
    String lastName;
    String firstName;
    @OneToMany(
            cascade = CascadeType.ALL,
            mappedBy = "customer"
    )
    List<PC> pcList = new ArrayList<>();
}
