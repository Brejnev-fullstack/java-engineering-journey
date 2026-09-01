public class PatternMatching {
    public static  void main(String[] args){
        Animal animal = new Chien();
        if(animal instanceof Chien chien){
            chien.aboyer();
        }
    }
}
