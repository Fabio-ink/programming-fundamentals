package oop.abstraction.entities;

public class NaturalPerson extends Person{

    private Double healthcareExpenses;

    public NaturalPerson(String name, Double yearIncome, Double healthcareExpenses) {
        super(name, yearIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public Double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(Double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }

    @Override
    public Double taxRates() {
        Double tax = null;
        if (yearIncome > 0 && yearIncome <= 20_000){
            if (healthcareExpenses != 0){
                tax = (yearIncome * 0.15) - (healthcareExpenses / 2);
            } else{
                tax = yearIncome * 0.15;
            }
        } else if (yearIncome > 20_000){
            if (healthcareExpenses != 0){
                tax = (yearIncome * 0.25) - (healthcareExpenses / 2);
            } else{
                tax = yearIncome * 0.25;
            }
        } else {
            System.out.println();
            System.out.println("ERRO: Sua renda anual é negativa, insira um valor válido");
        }
        return tax;
    }
}
