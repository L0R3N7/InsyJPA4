package at.hlt.workload.parts;

import lombok.Data;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@DiscriminatorColumn(name = "storage_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "\"Storage\"")
public abstract class Storage extends Part{
    Long storage;
    Long readSpeed;
    Long writeSpeed;
}
