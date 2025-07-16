package listTest.entities;

public class Employees {

    private Integer id;
    private String name;
    private Double income;

    public Employees(Integer id, String name, Double income) {
        this.id = id;
        this.name = name;
        this.income = income;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double IncomeUp(Double percent){
        income += income * percent / 100;
        return income;
    }

    @Override
    public String toString() {
        return "id = " + id + ", name = " + name + ", income = " + income;
    }

    

}
