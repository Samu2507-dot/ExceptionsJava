package MultiCatch;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewClass {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); //Puede lanzar NullPointerException
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); //Puede lanzar ArrayIndexOfBoundsException
            Path archivo = Paths.get("no-existe.txt");
            Files.readAllBytes(archivo);//Puede lanzar IOException
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de acceso a datos " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error de etrada/salida " + e.getMessage());
        } 
        System.out.println("El programa continua...");
        
        
        
    }
}