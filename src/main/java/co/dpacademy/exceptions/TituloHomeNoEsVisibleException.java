package co.dpacademy.exceptions;

public class TituloHomeNoEsVisibleException extends AssertionError {

    public static final String MENSAJE_EXCEPCION_TITULO_NO_VISIBLE = "El usuario esta bloqueado";
    public TituloHomeNoEsVisibleException(String mensaje, Throwable causa){
        super(mensaje, causa);
    }

}
