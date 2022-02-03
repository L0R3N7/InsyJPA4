package at.hlt.workload.pc;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class ConfiguredPC extends PC{
    @OneToMany(
            mappedBy = "id.configuredPC",
            cascade = CascadeType.ALL
    )
    List<PCPart> PCParts = new ArrayList<>();
    Boolean shouldBeBuilt;
}
