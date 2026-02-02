package ExcepcionPropia;

public class Principal {
    public static void main(String[] args) {
        ProcesadorDatos procesador = new ProcesadorDatos();
        try {
            //Intentamos convertir un texto inválido
            int numero = procesador.convertirTextoANumero("abc123");
            System.out.println("Número: " + numero);
        } catch (DatoInvalidoException e) {
            //Mostramos el emnsaje de nuestra excepción personalizada
            System.err.println("Error: " + e.getMessage());
            
            //Obtenemos y mostramos la causa original
            Throwable causa = e.getCause();
            if (causa != null) {
                System.err.println("Cusa: " + causa.getClass().getSimpleName());
                System.err.println("Detalle: " + causa.getMessage());
            }
        }
    }
}