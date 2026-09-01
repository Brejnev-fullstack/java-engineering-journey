public class MethodChallenge {

    public static void main(String[] args){
        StringBuilder builder = new StringBuilder();
        builder.append("JAVA ENGINEERING JOURNEY");
        String resultat = builder.toString();
        System.out.println(resultat);
        int[] nombre = {1,2,5,20};
        System.out.println(sommeTabeau(nombre));
    }

    public static int sommeTabeau(int[] numbers){
        int total = 0;
        for(int somme: numbers){
            total +=somme;
        }
        return total;
    }


}


/*La classe utilitaire java.util.Arrays
* Trier : Arrays.sort();
* Afficher : Arrays.toString();
* Copier: Arrays.copyOf();
 */


