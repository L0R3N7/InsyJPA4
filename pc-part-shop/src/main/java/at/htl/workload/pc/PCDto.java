package at.htl.workload.pc;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class PCDto implements Serializable {
    private Long id;
    private Long customerId;
    private BigDecimal price;
    private LocalDate warrantyEnd;

    public PCDto(Long id, Long customerId, BigDecimal price, LocalDate warrantyEnd) {
        this.id = id;
        this.customerId = customerId;
        this.price = price;
        this.warrantyEnd = warrantyEnd;
    }

    public PCDto() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setWarrantyEnd(LocalDate warrantyEnd) {
        this.warrantyEnd = warrantyEnd;
    }

    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getWarrantyEnd() {
        return warrantyEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PCDto entity = (PCDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.customerId, entity.customerId) &&
                Objects.equals(this.price, entity.price) &&
                Objects.equals(this.warrantyEnd, entity.warrantyEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customerId, price, warrantyEnd);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "customerId = " + customerId + ", " +
                "price = " + price + ", " +
                "warrantyEnd = " + warrantyEnd + ")";
    }
}
