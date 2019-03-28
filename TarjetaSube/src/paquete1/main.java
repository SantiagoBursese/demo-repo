
package paquete1;

public class main {
    public static void main (String [] args){
        Usuario usuario1 = new Usuario();
        usuario1.solicitarSube();
        usuario1.cargarSaldo(150);
        System.out.println("El saldo de la sube es " + usuario1.preguntarSaldo());
    }
}
