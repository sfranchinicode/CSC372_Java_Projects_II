/*
CheckingAccount extends to the BankAccount and adds
- Interest rate tracking
- Overdraft handling with penalty fee
*/
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

    /* Process the withdrawal including overdraft fee(s)
    If account balance becomes negative apply an overdraft fee automatically. 
    Fomatting applied to Current Balance to limit decimal output.
    */
    public void processWithdrawal(double amount) { 
        balance -= amount;

        if (balance <0) {
            balance -=30;
            System.out.println("\nAccount is overdrawn! Overdraft fee assessed ($30).");
        }
        System.out.println("\nCurrent Balance: $" + String.format("%.2f", balance));
    }

    /* Display account make interest rate a percent.
    Formatting used to maintain a consistent alignment of output 
    for improved readability in the console. 
    */
    public void displayAccount() {
        accountSummary();
        System.out.printf("%-15s %15s%n", "Interest Rate:", (interestRate * 100) + "%\n"); 
    }
}
