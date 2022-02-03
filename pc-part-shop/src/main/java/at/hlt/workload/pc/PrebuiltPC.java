package at.hlt.workload.pc;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
public class PrebuiltPC extends PC{
    String model;
    String manufacturer;
}
