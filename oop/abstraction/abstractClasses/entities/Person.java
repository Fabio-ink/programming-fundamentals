package oop.abstraction.abstractClasses.entities;

public abstract class Person {

    protected String name;
    protected Double yearIncome;
    
    public Person(String name, Double yearIncome) {
        this.name = name;
        this.yearIncome = yearIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getYearIncome() {
        return yearIncome;
    }

    public void setYearIncome(Double yearIncome) {
        this.yearIncome = yearIncome;
    }

    public abstract Double taxRates();

    @Override
    public String toString() {
        return name + ": R$" + String.format("%.2f", taxRates());
    }

}
