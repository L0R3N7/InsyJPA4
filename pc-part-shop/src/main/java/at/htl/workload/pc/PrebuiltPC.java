package at.htl.workload.pc;


import javax.persistence.Entity;

@Entity
public class PrebuiltPC extends PC{
    String model;
    String manufacturer;

    public PrebuiltPC() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
