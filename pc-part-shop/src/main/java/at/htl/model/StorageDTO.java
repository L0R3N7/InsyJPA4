package at.htl.model;

import java.io.Serializable;

public class StorageDTO extends PartDTO implements Serializable {
    Long storage;
    Long readSpeed;
    Long writeSpeed;

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
