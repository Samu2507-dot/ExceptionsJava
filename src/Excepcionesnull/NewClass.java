package Excepcionesnull;

public class NewClass {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); //Podría lanzar NullPointerException
        } catch (NullPointerException e) {
            System.err.println("Error: objeto null"); //Especifica se captura primero
        } catch (RuntimeException e) {
            System.err.println("Error en tiempo de ejeccucion"); //Mas generica que NullPointer
        } catch (Exception e) {
            System.err.println("Error general"); //La más generica: se captura al final
        }
        System.out.println("Fin del programa");
    }
}