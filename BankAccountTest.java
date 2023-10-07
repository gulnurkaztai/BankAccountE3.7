public class BankAccountTest {
    
    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.withdraw(500);
        bankAccount.withdraw(400);
        System.out.println("Expected balance amount is 100$");
        System.out.println(bankAccount.getBalance() + "$");
        bankAccount.addInterest(10);
        System.out.println("Expected balance amount is now 110$");
        System.out.println(bankAccount.getBalance() + "$");
    }
}
