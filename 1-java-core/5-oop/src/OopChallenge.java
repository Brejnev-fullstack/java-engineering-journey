public class OopChallenge {

    public static void main(String[] args){
        BankAccount bank= new BankAccount("Brejnev");
        System.out.println(bank.getBalance());

        bank.addBalance(1000);
        System.out.println(bank.getBalance());

        bank.retraitBalance(2525);

    }
}
