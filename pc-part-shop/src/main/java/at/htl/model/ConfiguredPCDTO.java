package at.htl.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class ConfiguredPCDTO implements Serializable {
    private Long id;
    private BigDecimal price;
    private LocalDate warrantyEnd;
    private Boolean shouldBeBuilt;

    public ConfiguredPCDTO(Long id, BigDecimal price, LocalDate warrantyEnd, Boolean shouldBeBuilt) {
        this.id = id;
        this.price = price;
        this.warrantyEnd = warrantyEnd;
        this.shouldBeBuilt = shouldBeBuilt;
    }

    public ConfiguredPCDTO() {
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

    public Boolean getShouldBeBuilt() {
        return shouldBeBuilt;
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

    public void setShouldBeBuilt(Boolean shouldBeBuilt) {
        this.shouldBeBuilt = shouldBeBuilt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ConfiguredPCDTO entity = (ConfiguredPCDTO) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.warrantyEnd, entity.warrantyEnd) &&
                Objects.equals(this.shouldBeBuilt, entity.shouldBeBuilt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, warrantyEnd, shouldBeBuilt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "price = " + price + ", " +
                "warrantyEnd = " + warrantyEnd + ", " +
                "shouldBeBuilt = " + shouldBeBuilt + ")";
    }
}
