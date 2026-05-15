public class CheckingAccount extends BankAccount {
    
    //Interest rate field
    private double interestRate;

    // Required Setter and Getter
    public void  setInterestRate(double interestRate) { 
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }

    // Process the withdrawal including overdraft fee(s)
    public void processWithdrawal(double amount) { 
        balance -= amount;

        if (balance <0) {
            balance -=30;
            System.out.println("\nAccount is overdrawn! Overdraft fee assessed ($30).");
        }
        System.out.println("\nCurrent Balance: $" + String.format("%.2f", balance));
    }

    // Display account make interest rate a percent
    public void displayAccount() {
        accountSummary();
        System.out.printf("%-15s %15s%n", "Interest Rate:", (interestRate * 100) + "%\n"); 
    }
}
