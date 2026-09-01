public class EnumerationChallenge {

    public static void main(String[] args){
        Jour jour = Jour.LUNDI;
        String messageJour = switch(jour){
            case LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI ->"Jours de travail intense";
            case SAMEDI,DIMANCHE ->"Week-end";
        };
        System.out.println(messageJour);
    }
    public enum Jour{
        LUNDI,MARDI,MERCREDI,JEUDI,VENDREDI,SAMEDI,DIMANCHE
    }

}
