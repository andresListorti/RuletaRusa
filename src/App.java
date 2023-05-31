import javax.sound.sampled.SourceDataLine;

import entidades.Jugador;
import entidades.RevolverDeAgua;
import entidades.servicios.JugadorService;
import entidades.servicios.RevolverDeAguaService;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos Objetos
        RevolverDeAguaService serviceRevol = new RevolverDeAguaService();
        RevolverDeAgua revolver = new RevolverDeAgua();
        // mostramos vacio
        System.out.println(revolver);
        // Llenamos cpn random de 1 a 6
        serviceRevol.llenarRevolver(revolver);
        // Mostramos lleno
        System.out.println(revolver);
        // Mojar
        serviceRevol.mojar(revolver);
        // Siguiente posicion Tambor
        serviceRevol.siguienteChorro(revolver);
        System.out.println(revolver);
        //
        Jugador jugador1 = new Jugador(11, false);
        JugadorService serviceJugadores = new JugadorService();
        serviceJugadores.disparo(revolver, jugador1);
        System.out.println(revolver);
        System.out.println(jugador1);
    }
}
