package Excepciones;

import java.util.*;

public class Excepciones {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
        int resultado = a/b;
        System.out.println("Resultado: "+ resultado);       
        } catch (ArithmeticException e) {
            System.err.println("Error: No se puede dividir entre 0");
            System.out.println("Mensaje técnico: " + e.getMessage());
        } catch (Exception e) {
            
        }
        System.out.println("El programa continua...");
    }
}