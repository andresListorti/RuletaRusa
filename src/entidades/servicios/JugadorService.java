package entidades.servicios;

import entidades.Jugador;
import entidades.RevolverDeAgua;

public class JugadorService {
    RevolverDeAguaService service = new RevolverDeAguaService();

    public boolean disparo(RevolverDeAgua revolverDeAgua, Jugador jugador) {
        boolean mojado = service.mojar(revolverDeAgua);
        if (mojado) {
            jugador.setMojado(true);
        } else {
            jugador.setMojado(false);
        }
        service.siguienteChorro(revolverDeAgua);
        return mojado;
    }
}
