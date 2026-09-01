public class BankAccount {
    private final String nameCount;
    private double balance;

    public BankAccount(String name){
        this.nameCount = name;
        this.balance = 0;
    }

    public void addBalance(double argent){
        if( argent <=0){
            throw new IllegalArgumentException("Le montant vide");
        }
        balance +=argent;
    }

    public void retraitBalance(double argent){
        if(argent <= 0){
            throw new IllegalArgumentException("Sommes vide");
        }
        if(argent > balance){
            throw new IllegalArgumentException("Retrait superieur à la somme");
        }

        balance -=argent;
    }

    public double getBalance() {
        return balance;
    }


}
