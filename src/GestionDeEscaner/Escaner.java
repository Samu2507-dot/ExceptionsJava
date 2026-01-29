package GestionDeEscaner;

import java.util.Scanner;

public class Escaner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero");
            int numero = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            System.err.println("Error: Debes introducir un número");
        } finally {
            System.out.println("Este mensaje aparece siempre");
        }
        System.out.println("El programa continua...");
        //Aqui se liberan recursos
        sc.close();
    }
}
