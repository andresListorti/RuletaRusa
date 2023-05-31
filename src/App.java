import javax.sound.sampled.SourceDataLine;

import entidades.RevolverDeAgua;
import entidades.servicios.RevolverDeAguaService;

public class App {
    public static void main(String[] args) throws Exception {
        RevolverDeAguaService serviseRevol = new RevolverDeAguaService();
        RevolverDeAgua revol1 = new RevolverDeAgua();
        System.out.println(revol1);
        serviseRevol.llenarRevolver(revol1);
        System.out.println(revol1);
        serviseRevol.mojar(revol1);
    }
}
