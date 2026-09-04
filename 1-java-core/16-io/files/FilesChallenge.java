import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesChallenge {
    public static void main(String[] args){
        try(
                FileInputStream input = new FileInputStream("file.txt");
                FileOutputStream output = new FileOutputStream("destination.txt")
                ){
               int valeur;
               while((valeur = input.read()) !=-1){
                   output.write(valeur);
               }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
