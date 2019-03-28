package paquete1;

public class Sube {
    private int saldo;
    private static final double SALDO_NEGATIVO = -20;
    private boolean estaActivada;
    
    public Sube(int saldo){
        this.saldo = saldo;
        estaActivada = true;
    }
    
    public void cargarSaldo(int plata){
        saldo += plata;
    }

    public int saldoSube() {
        return saldo;
    }
    
    public boolean puedoPagar(double importe){
        return SALDO_NEGATIVO <= (saldo - importe);
    }
    
    public void realizarPago(int costo) {
        if(puedoPagar(costo)){
            saldo -= costo;
        }
        else{
            throw new NoPuedePagarException();
        }
    }
    
    public void bloquearTarjeta(){
        estaActivada = false;
    }
}
