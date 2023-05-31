package entidades;

public class RevolverDeAgua {
    private Integer posicionActualDeTambor;
    private Integer posicionAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(Integer posicionActualDeTambor, Integer posicionAgua) {
        this.posicionActualDeTambor = posicionActualDeTambor;
        this.posicionAgua = posicionAgua;
    }

    public Integer getPosicionActualDeTambor() {
        return this.posicionActualDeTambor;
    }

    public void setPosicionActualDeTambor(Integer posicionActualDeTambor) {
        this.posicionActualDeTambor = posicionActualDeTambor;
    }

    public Integer getPosicionAgua() {
        return this.posicionAgua;
    }

    public void setPosicionAgua(Integer posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "{" +
                " posicionActualDeTambor='" + getPosicionActualDeTambor() + "'" +
                ", posicionAgua='" + getPosicionAgua() + "'" +
                "}";
    }

}
