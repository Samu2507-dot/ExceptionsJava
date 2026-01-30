package ExcepcionPersonal;

public class EdadInvalidaException extends Exception {
    
    public EdadInvalidaException() {
        super("La edad introducida no es valida");
    }
    
    public EdadInvalidaException(String message) {
        super(message);
    }
    
    
}