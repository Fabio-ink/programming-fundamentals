package oop.polymorphism.entities;

public class ImportedProduct extends Product{

    private Double customFee;

    public ImportedProduct(String name, Double value, Double customFee) {
        super(name, value);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }

    public Double totalValue(){
        return value + customFee;
    }

   @Override
    public String toString() {
        return name + ", R$ " + String.format("%.2f", totalValue()) + " (Taxa de importação de: R$" + String.format("%.2f", customFee) + ")";
    }


    

    

}
