package oop.polymorphism.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufactureDate;

    public UsedProduct(String name, Double value, Date manufactureDate) {
        super(name, value);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return name + "(Usado), R$ " + value + " (Data de fabricação: " + sdf.format(manufactureDate) + ")";
    }

    

}
