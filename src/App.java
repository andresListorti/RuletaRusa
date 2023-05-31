import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverDeAgua;
import entidades.servicios.JugadorService;
import entidades.servicios.RevolverDeAguaService;

public class App {
    public static void main(String[] args) throws Exception {
        // Creamos Revolver
        RevolverDeAguaService serviceRevol = new RevolverDeAguaService();
        RevolverDeAgua revolver = new RevolverDeAgua();
        // Llenamos con random de 1 a 6
        System.out.println("LLenando revolver");
        serviceRevol.llenarRevolver(revolver);
        // Mostramos lleno
        System.out.println(revolver);
        // Creamos Jugadores
        Jugador jugador1 = new Jugador(1, false);
        Jugador jugador2 = new Jugador(2, false);
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        // JUEGO
        System.out.println("NUEVO JUEGO");
        Juego juego = new Juego();

        juego.llenarJuego(jugadores, revolver);
        juego.ronda();

    }
}
