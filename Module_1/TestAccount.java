public class TestAccount {

    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount();

        acct.setFirstName( "Chesty");
        acct.setLastName("Puller");
        acct.setAccountID(199836);
        acct.setInterestRate(0.15);
        acct.deposit(2000.01);
        acct.processWithdrawal(702.41);
        acct.displayAccount();
    }
}
