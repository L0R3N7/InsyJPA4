package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"SSD\"")
public class SSD extends Storage{
    String interfaceType;

    public SSD() {
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }
}
