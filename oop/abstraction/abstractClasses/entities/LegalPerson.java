package oop.abstraction.abstractClasses.entities;

public class LegalPerson extends Person{

    private Integer employees;

    public LegalPerson(String name, Double yearIncome, Integer employees) {
        super(name, yearIncome);
        this.employees = employees;
    }

    public Integer getEmployees() {
        return employees;
    }

    public void setEmployees(Integer employees) {
        this.employees = employees;
    }

    @Override
    public Double taxRates() {
        Double tax = null;
        if (employees > 0 && employees <= 10){
            tax = yearIncome * 0.16;
        } else if (employees > 10){
            tax = yearIncome * 0.14;
        } else{
            System.out.println();
            System.out.println("ERRO: Sua empresa não possui nenhum empregado");
        }
        return tax;
    }
}
