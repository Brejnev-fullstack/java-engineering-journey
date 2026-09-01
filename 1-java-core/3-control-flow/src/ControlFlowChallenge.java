public class ControlFlowChallenge {
    public static  void main(String[] args){
        int day = 6;

        String type = switch (day) {
            case 1, 2, 3, 4, 5 -> "Semaine";
            case 6, 7 -> "Weekend";
            default -> "Invalide";
        };

        System.out.println(type);

        for(int i = 0; i<=100; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
