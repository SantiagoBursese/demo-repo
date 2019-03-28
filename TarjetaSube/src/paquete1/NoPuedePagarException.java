package paquete1;


public class NoPuedePagarException extends RuntimeException {
    public NoPuedePagarException() {
        super("Saldo Insuficiente");
    }   
}
