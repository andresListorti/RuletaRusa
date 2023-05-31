package entidades;

import entidades.Jugador;
import entidades.servicios.JugadorService;

import java.util.ArrayList;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverDeAgua revolver;
    JugadorService serviceJugadores = new JugadorService();

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public void ronda() {
        int cont = 1;
        boolean mojado = false;
        do {

            for (Jugador jugador : jugadores) {

                if (jugador.getMojado()) {
                    break;
                }
                System.out.println("Disparo " + cont);
                System.out.println(jugador);
                serviceJugadores.disparo(revolver, jugador);
                if (jugador.getMojado()) {
                    System.out.println("MOJADO FIN");
                    System.out.println("El Jugador mojado fue " + jugador.getID());
                    mojado = true;
                    break;
                } else {
                    System.out.println("Este no se mojo y van " + cont);

                }
                cont++;

            }
        } while (!mojado);
    }

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public RevolverDeAgua getRevolver() {
        return this.revolver;
    }

    public void setRevolver(RevolverDeAgua revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "{" +
                " jugadores='" + getJugadores() + "'" +
                ", revolver='" + getRevolver() + "'" +
                "}";
    }

}
