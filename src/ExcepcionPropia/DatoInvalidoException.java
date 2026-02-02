package ExcepcionPropia;

public class DatoInvalidoException extends Exception{
    //Constructor con mensaje
    public DatoInvalidoException(String mensaje){
        super(mensaje);
    }

    //Constructor con mensaje y causa
    public DatoInvalidoException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}