import org.testng.annotations.Test;
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
public class bank {
    class RealBankAccount implements BankAccount {
        private double balance;
        public RealBankAccount(double balance) {
            this.balance = balance;
        }
        @Override
        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited " + amount + ", balance is now " + balance);
        }
        @Override
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew " + amount + ", balance is now " + balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        }
        @Override
        public double getBalance() {
            return balance;
        }
    }
    class BankAccountProxy implements BankAccount {
        private RealBankAccount realBankAccount;
        public BankAccountProxy(RealBankAccount realBankAccount) {
            this.realBankAccount = realBankAccount;
        }
        @Override
        public void deposit(double amount) {
            realBankAccount.deposit(amount);
        }
        @Override
        public void withdraw(double amount) {
            realBankAccount.withdraw(amount);
        }
        @Override
        public double getBalance() {
            return realBankAccount.getBalance();
        }
    }
    public void jj() {
        BankAccount bankAccount = new BankAccountProxy(new RealBankAccount(1000.0));
        bankAccount.deposit(500.0);
        bankAccount.withdraw(200.0);
        bankAccount.withdraw(1500.0);
    }
    public static void main(String[] args) {
     bank bank=new bank();
        bank.jj();
    }
}

