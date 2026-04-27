class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void updateBalance(double amount) {
        this.balance += amount;
    }
}

class TransactionService {

    public void deposit(BankAccount account, double amount) {
        if (amount > 0) {
            account.updateBalance(amount);
        }
    }

    public void withdraw(BankAccount account, double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.updateBalance(-amount);
        }
    }
}

class StatementPrinter {

    public void printStatement(BankAccount account) {
        System.out.println("Current Balance: " + account.getBalance());
    }
}


class GoodDesign {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);
        System.out.println("Initial Balance: " + account.getBalance());

        account.updateBalance(500.0);
        System.out.println("After Deposit: " + account.getBalance());

        account.updateBalance(-200.0);
        System.out.println("After Withdrawal: " + account.getBalance());
    }
}
