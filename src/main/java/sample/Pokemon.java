package sample;

import javafx.scene.image.Image;

public class Pokemon{

    private int nivel;
    private String nombre;
    private int vidamax;
    private int vidaact;
    private Image imagen;

    public Pokemon(int nivel, String nombre, int vidamax, int vidaact, Image imagen) {
        this.nivel = nivel;
        this.nombre = nombre;
        this.vidamax = vidamax;
        this.vidaact = vidaact;
        this.imagen = imagen;
    }

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

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }



    public static void curacion(Pokemon pokemon){
        pokemon.setVidaact((int) (pokemon.getVidaact()+ Math.random()*76 + 25));
    }
    public static void ataqueseguro(Pokemon enemigo){
        enemigo.setVidaact(enemigo.getVidaact()-20);
    }

    public static void ataquepocoseguro(Pokemon enemigo){
        enemigo.setVidaact((int) (enemigo.getVidaact()- Math.random()*26 + 10));
    }

    public static void ataquenadaseguro(Pokemon enemigo){
        enemigo.setVidaact((int) (enemigo.getVidaact()- Math.random()*51 + 0));
    }
}
