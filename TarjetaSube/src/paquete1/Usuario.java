package paquete1;

public class Usuario {
    private Sube sube;
   
    public void solicitarSube(){
        sube = new Sube(0);
    }
    
    public void cargarSaldo(int plata){
        sube.cargarSaldo(plata);
    }
    
    public int preguntarSaldo(){
        return sube.saldoSube();
    }
    
    public void realizarViaje(MedioTransporte medioTransp){
        sube.realizarPago(medioTransp.costoViaje());
    }
    
    public void pagarServicio(Servicio servicio){
        sube.realizarPago(servicio.costoServicio());
    }
    
    public void reportarTarjeta(){
        sube.bloquearTarjeta();
    }
    
}
