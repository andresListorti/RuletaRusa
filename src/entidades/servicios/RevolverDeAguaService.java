package entidades.servicios;

import entidades.RevolverDeAgua;

public class RevolverDeAguaService {
    public void llenarRevolver(RevolverDeAgua revolverDeAgua) {
        Double posicionActualDeTamborEJ = Math.floor(Math.random() * 6);
        Double posicionAguaEJ = Math.ceil(Math.random() * 6);

        Integer posicionActualDeTambor = posicionActualDeTamborEJ.intValue();
        Integer posicionAgua = posicionAguaEJ.intValue();

        revolverDeAgua.setPosicionActualDeTambor(posicionActualDeTambor);
        revolverDeAgua.setPosicionAgua(posicionAgua);
    }

    public boolean mojar(RevolverDeAgua revolverDeAgua) {
        boolean mojar = false;
        if (revolverDeAgua.getPosicionActualDeTambor() == revolverDeAgua.getPosicionAgua()) {
            mojar = true;
            System.out.println("--------------MOJADO----------------");
        } else {
            System.out.println("--------------ZAFO-------------");
        }
        return mojar;
    }

}
