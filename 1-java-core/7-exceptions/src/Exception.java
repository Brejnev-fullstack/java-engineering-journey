
public class Exception {

    static  void calcule() throws RuntimeException{
        throw new RuntimeException("Problème technique");
    }
    public static void main(String[] args){
        System.out.println("Bien exception");
        try{
            int a = 10/2;
        } catch (ArithmeticException e) {
            System.out.println("Erreur de division par zero");
        }
        System.out.println("fin");
    }
}
