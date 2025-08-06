package oop.inheritance.entities;

public final class SavingsAccount extends Account{ //A palavra final impede que sejam criadas subclasses da classe SavingsAccount.

    private Double interestRate;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        double updated = getBalance() * interestRate / 100;
        deposit(updated);
    }

    @Override
    public final void withdraw(Double amount) { // reescreve o código da superclasse para que não aja desconto/taxa no saque.
        this.balance -= amount;
    }

    @Override
    public String toString() {
        return "SavingsAccount [number = " + number + ", holder = " + holder + ", balance = " + balance + ", interest rate = " + interestRate + "]";
    }
    

}
