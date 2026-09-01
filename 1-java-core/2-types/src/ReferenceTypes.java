import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args){
        int[] nombre = {2,5,6,5};
        nombre[0] = 15;
        int[] nombreCopie = nombre;
        nombreCopie[2] = 65;
        int[] nombreCopieBien = Arrays.copyOf(nombre, nombre.length);
        nombreCopieBien[1] = 17;

        System.out.println(Arrays.toString(nombre));
        System.out.println(Arrays.toString(nombreCopie));
        System.out.println(Arrays.toString(nombreCopieBien));


        ConversionUpcasting mere = new ConversionUpcastingDerivee();
        mere.parler();
    }
}
