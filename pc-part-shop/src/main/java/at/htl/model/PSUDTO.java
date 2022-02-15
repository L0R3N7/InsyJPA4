package at.htl.model;

import java.io.Serializable;

public class PSUDTO extends PartDTO implements Serializable {
    Long power;
    String rating;

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
