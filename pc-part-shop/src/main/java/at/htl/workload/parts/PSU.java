package at.htl.workload.parts;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "\"PSU\"")
public class PSU extends Part{
    Long power;
    String rating;

    public PSU() {
    }

    public Long getPower() {
        return power;
    }

    public void setPower(Long power) {
        this.power = power;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
