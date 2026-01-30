package ExcepcionPersonal;

public class ServicioUsuario {
    public void registrarUsuario(String nombre, int edad) throws EdadInvalidaException {
        //Validacion 1: edad negativa
        if (edad < 0) {
            throw new EdadInvalidaException(
                    "La edad no puede ser negativa, " + edad);
        }
        //Validacion 2: menor de edad
        if (edad < 18) {
            throw new EdadInvalidaException(
            "Debes ser mayor de 18 años. Tienes: " + edad);
        }
        //Validacion 3: edad poco realista
        if (edad > 120) {
            throw new EdadInvalidaException();
        }
        //Si pasa todas las validaciones
        System.out.println("El dato es valido para la BBDD");
        
        
    }
}