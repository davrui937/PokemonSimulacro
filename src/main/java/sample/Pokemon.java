package sample;

public class Pokemon{

    private int nivel;
    private String nombre;
    private int vidamax;
    private int vidaact;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidamax() {
        return vidamax;
    }

    public void setVidamax(int vidamax) {
        this.vidamax = vidamax;
    }

    public int getVidaact() {
        return vidaact;
    }

    public void setVidaact(int vidaact) {
        this.vidaact = vidaact;
    }

    public Pokemon(int nivel, String nombre, int vidamax, int vidaact) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidaact = vidaact;
    }
}
