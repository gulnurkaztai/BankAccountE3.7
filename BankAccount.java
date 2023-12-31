/**
 * A bank account has a balance that can be changed by deposits and withdrawals
 */

 public class BankAccount{
    private double balance;

    /**
     * Constructs a bank account with a zero balance.
     */

     public BankAccount(){
        this.balance = 0;
     }

     /**
      * Constructs a bank account with a given balance.
      @param initialBalance the initial balance.
      */

      public BankAccount(double initialBalance){
        this.balance = initialBalance;
      }

      /**
       * Deposits money into the bank account.
       * @param amount the amount to deposit.
       */

       public void deposit(double amount){
        this.balance = this.balance + amount;
       }

       /**
        * Withdraws money from the bank account.
        @param amount the amount to withdraw.
        */

        public void withdraw(double amount){
            this.balance = this.balance - amount;
        }

        public double getBalance(){
            return this.balance;
        }

        public void addInterest(double rate){
            this.balance += (this.balance * rate)/100;
        }

 }