public class BankAccount {
   private String firstName;
   private String lastName;
   private int accountID;
   protected double balance;

   public BankAccount() {
      balance = 0;
   }

   public void deposit(double amount) {
      this.balance += amount;
   }

   public void withdrawal(double amount) {
      this.balance -= amount;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public void setAccountID(int accountID) {
      this.accountID = accountID;
   }

   public String getFirstName() {
      return this.firstName;
   }

   public String getLastName() {
      return this.lastName;
   }

   public int getAccountID() {
      return this.accountID;
   }

   public double getBalance() {
      return this.balance;
   }

   public void accountSummary() {
      System.out.println("\n");
      System.out.printf("     ***Account Summary***\n");
      System.out.printf("%-15s %15s%n","First & Last Name: ", this.firstName + " " + this.lastName);
      System.out.printf("%-15s %15d%n", "Account ID:", this.accountID);
      System.out.printf("%-15s %15s%n", "Balance: $", String.format("%.2f", this.balance));
   }
}
