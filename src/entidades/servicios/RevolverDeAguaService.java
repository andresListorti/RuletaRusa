package entidades.servicios;

import entidades.RevolverDeAgua;

public class RevolverDeAguaService {
    public void llenarRevolver(RevolverDeAgua revolverDeAgua) {
        Double posicionActualDeTamborEJ = Math.ceil(Math.random() * 6);
        Double posicionAguaEJ = Math.ceil(Math.random() * 6);

        Integer posicionActualDeTambor = posicionActualDeTamborEJ.intValue();
        Integer posicionAgua = posicionAguaEJ.intValue();

        revolverDeAgua.setPosicionActualDeTambor(posicionActualDeTambor);
        revolverDeAgua.setPosicionAgua(posicionAgua);
    }

    public boolean mojar(RevolverDeAgua revolverDeAgua) {
        boolean mojar;
        if (revolverDeAgua.getPosicionActualDeTambor() == revolverDeAgua.getPosicionAgua()) {
            mojar = true;
            System.out.println("--------------MOJADO----------------");
        } else {
            mojar = false;
            System.out.println("--------------ZAFO-------------");
        }
        return mojar;
    }

    public void siguienteChorro(RevolverDeAgua revolverDeAgua) {
        if (revolverDeAgua.getPosicionActualDeTambor() == 6) {
            revolverDeAgua.setPosicionActualDeTambor(1);
        } else {
            revolverDeAgua.setPosicionActualDeTambor(revolverDeAgua.getPosicionActualDeTambor() + 1);
        }

    }

}
