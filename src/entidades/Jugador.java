package entidades;

public class Jugador {
    private Integer ID;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer ID, Boolean mojado) {
        this.ID = ID;
        this.mojado = mojado;
    }

    public Integer getID() {
        return this.ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Boolean isMojado() {
        return this.mojado;
    }

    public Boolean getMojado() {
        return this.mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "{" +
                " ID='" + getID() + "'" +
                ", mojado='" + isMojado() + "'" +
                "}";
    }

}
