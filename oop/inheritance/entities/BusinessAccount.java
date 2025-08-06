package oop.inheritance.entities;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(Double loanLimit) {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) { // Método construtor de uma classe que herda uma classe pai
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amont){
        Double tax = 10.0 / amont  * 100;
        if (amont <= loanLimit){
            balance += amont - tax;
        }
    }

    @Override
    public final void withdraw(Double amount) { // Realiza o saque normal da superclasse (Account e desconta o valor a mais, no caso o 2.0)
        super.withdraw(amount);
        balance -= 2.0;
    }

    @Override
    public String toString() {
        return "BusinessAccount [number = " + number + ", holder = " + holder + ", loan limit = "+ loanLimit +", balance = " + balance + "]";
    }

}
