package at.htl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class PrebuiltPCDTO implements Serializable {
    Long id;
    BigDecimal price;
    LocalDate warrantyEnd;
    String model;
    String manufacturer;

    public PrebuiltPCDTO(Long id, BigDecimal price, LocalDate warrantyEnd, String model, String manufacturer) {
        this.id = id;
        this.price = price;
        this.warrantyEnd = warrantyEnd;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    public PrebuiltPCDTO() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWarrantyEnd(LocalDate warrantyEnd) {
        this.warrantyEnd = warrantyEnd;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getWarrantyEnd() {
        return warrantyEnd;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrebuiltPCDTO entity = (PrebuiltPCDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.warrantyEnd, entity.warrantyEnd) &&
                Objects.equals(this.model, entity.model) &&
                Objects.equals(this.manufacturer, entity.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, warrantyEnd, model, manufacturer);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "price = " + price + ", " +
                "warrantyEnd = " + warrantyEnd + ", " +
                "model = " + model + ", " +
                "manufacturer = " + manufacturer + ")";
    }
}
