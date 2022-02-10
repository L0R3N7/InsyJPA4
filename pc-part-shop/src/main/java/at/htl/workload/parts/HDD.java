package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"HDD\"")
public class HDD extends Storage{
    Long RPM;

    public HDD() {
    }

    public Long getRPM() {
        return RPM;
    }

    public void setRPM(Long RPM) {
        this.RPM = RPM;
    }
}
