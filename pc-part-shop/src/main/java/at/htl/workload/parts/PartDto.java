package at.htl.workload.parts;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class PartDto implements Serializable {
    private String serialNumber;
    private String name;
    private BigDecimal price;
    private String type;

    public PartDto(String serialNumber, String name, BigDecimal price, String type) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.price = price;
        this.type = type;
    }

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
        PartDto entity = (PartDto) o;
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
