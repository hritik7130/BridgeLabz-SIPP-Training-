package ewallet;
class Wallet {
    private double balance;

    public Wallet(double initialBalance) {
        this.balance = Math.max(initialBalance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean transferTo(Wallet receiver, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            receiver.addMoney(amount);
            return true;
        }
        return false;
    }
}


class PersonalWallet extends Wallet {
    private static final double tranferlimit = 500;

    public PersonalWallet(double balance) {
        super(balance);
    }

  
    public boolean transferTo(Wallet receiver, double amount) {
        if (amount > transferlimit) {
            System.out.println("Transfer failed: .");
            return false;
        }
        return super.transferTo(receiver, amount);
    }
}


class BusinessWallet extends Wallet {
    private static final double transfer_limit = 5000;

    public BusinessWallet(double balance) {
        super(balance);
    }

   
    public boolean transferTo(Wallet receiver, double amount) {
        if (amount > transfer_limit) {
            System.out.println("Transfer failed.");
            return false;
        }
        return super.transferTo(receiver, amount);
    }
}


class User {
    private String name;
    protected Wallet wallet;

    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void loadMoney(double amount) {
        wallet.addMoney(amount);
        System.out.println(name + "  " + amount);
    }

    public void transferMoney(User receiver, double amount) {
        boolean success = this.wallet.transferTo(receiver.wallet, amount);
        if (success) {
            System.out.println(name + " transferred " + amount + " to " + receiver.name);
        } else {
            System.out.println(name + " failed to transfer money.");
        }
    }

    public void showBalance() {
        System.out.println(name + "'s balance: " + wallet.getBalance());
    }
}


public class EwalletApp {
    public static void main(String[] args) {
        User Hritik = new User("Hritik", new PersonalWallet(300));
        User bob = new User("Bob", new BusinessWallet(2000));

        Hritik.showBalance();
        bob.showBalance();

        Hritik.transferMoney(bob, 400); 
        Hritik.transferMoney(bob, 200); 

        Hritik.showBalance();
        bob.showBalance();

        Hritik.transferMoney(Hritik, 1000); 

        Hritik.showBalance();
        bob.showBalance();
    }
}
