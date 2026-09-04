import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferChallenge {
    public static void main(String[] args){
        try(
                BufferedInputStream source = new BufferedInputStream(new FileInputStream("source.tx"));
                BufferedOutputStream destination = new BufferedOutputStream(new FileOutputStream("destination.txt"))
                ){
               int valeur;
               while((valeur = source.read()) !=-1){
                   destination.write(valeur);
               }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
