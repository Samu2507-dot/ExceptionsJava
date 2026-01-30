package ExcepcionPersonal;

public class Principal {
    public static void main(String[] args) {
        ServicioUsuario servicio = new ServicioUsuario();
        //Caso 1: Usuario válido
        try {
            servicio.registrarUsuario("Ana García", 25);
        } catch (EdadInvalidaException e) {
            System.err.println("Error al registrar usuario (Caso 1): " + e.getMessage());
        }
        System.out.println("------------------------------------");
        //Caso 2: Usuario con edad invalida (menor de edad)
        try {
            servicio.registrarUsuario("Juan Pérez", 10);
        } catch (EdadInvalidaException e) {
            System.err.println("Error al registrar usuario (Caso 2): " + e.getMessage());
        }
        System.out.println("------------------------------------");
        //Caso 3: Otro usuario con edad invalida (negativa)
        try {
            servicio.registrarUsuario("Pedro Rodriguez", -5);
        } catch (EdadInvalidaException e) {
            System.err.println("Error al registrar usuario (Caso 3): " + e.getMessage());
        }       
    }    
}