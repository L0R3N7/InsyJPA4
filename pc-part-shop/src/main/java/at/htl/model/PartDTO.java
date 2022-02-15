package at.htl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class PartDTO implements Serializable {
    private String serialNumber;
    private String name;
    private BigDecimal price;
    private String type;

    public PartDTO() {}

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartDTO entity = (PartDTO) o;
        return Objects.equals(this.serialNumber, entity.serialNumber) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.type, entity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, name, price, type);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "serialNumber = " + serialNumber + ", " +
                "name = " + name + ", " +
                "price = " + price + ", " +
                "type = " + type + ")";
    }
}
