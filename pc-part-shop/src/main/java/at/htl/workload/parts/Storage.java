package at.htl.workload.parts;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorColumn(name = "storage_type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "\"Storage\"")
public class Storage extends Part{
    Long storage;
    Long readSpeed;
    Long writeSpeed;

    public Storage() {
    }

    public Long getStorage() {
        return storage;
    }

    public void setStorage(Long storage) {
        this.storage = storage;
    }

    public Long getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(Long readSpeed) {
        this.readSpeed = readSpeed;
    }

    public Long getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(Long writeSpeed) {
        this.writeSpeed = writeSpeed;
    }
}
