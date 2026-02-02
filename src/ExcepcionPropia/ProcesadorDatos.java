package ExcepcionPropia;

public class ProcesadorDatos {
    public int convertirTextoANumero(String texto) throws DatoInvalidoException {
        //Intentamos convertir el texto a numero
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) {
            //Si falla, lanzamos nuestra excepción personalizadaç
            throw new DatoInvalidoException ("No se pudo convertir el texto"
                    + " a número: " + texto, e);
        }
    }
}