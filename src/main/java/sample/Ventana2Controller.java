package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ventana2Controller {

    Pokemon pokemon=null;
    Pokemon enemigo=null;
    String nivelaux = "Nv ";

    Ventana1Controller controlador1=null;


    public Ventana2Controller() {
    }

    public void recibircontrolador(Ventana1Controller controlador1){this.controlador1=controlador1;}

    public void pasarPokemon(Pokemon pokemon, Pokemon enemigo) {
        this.pokemon=pokemon;
        this.enemigo=enemigo;
        nombrepok.setText(pokemon.getNombre());
        nivelpok.setText(nivelaux +pokemon.getNivel());
        barravidapok.setProgress((pokemon.getVidaact()*0.01));
        pok.setImage(pokemon.getImagenpelea());

        nombreene.setText(enemigo.getNombre());
        nivelene.setText(nivelaux +enemigo.getNivel());
        barravidaene.setProgress((enemigo.getVidaact()*0.01));
        ene.setImage(enemigo.getImagen());
    }


    @FXML
    Button botonatacar;
    @FXML
    Button botoncurarse;
    @FXML
    Button botonmuyarriesgado;
    @FXML
    Button botonarriesgado;
    @FXML
    Button botonseguro;
    @FXML
    Button botoncancelar;


     @FXML
     Label nombrepok;
     @FXML
     Label nivelpok;
     @FXML
     Label pspok;
     @FXML
     ProgressBar barravidapok;
     @FXML
     ImageView pok;

     @FXML
     Label nombreene;
     @FXML
     Label nivelene;
     @FXML
     Label psene;
    @FXML
    ProgressBar barravidaene;
     @FXML
     ImageView ene;

    @FXML
    private void initialize(){

    }


    @FXML
    private void clickcurar(){
    pokemon.curacion(pokemon);
    actualizarvida(barravidapok,pokemon);

    enemigo.curacion(enemigo);
    actualizarvida(barravidaene,enemigo);
    }

    @FXML
    private void clickatacar(){

        botonarriesgado.setVisible(true);
        botonmuyarriesgado.setVisible(true);
        botonseguro.setVisible(true);
        botoncancelar.setVisible(true);
        botonatacar.setVisible(false);
        botoncurarse.setVisible(false);

    }

    @FXML
    private void clickcancelar(){
        botonarriesgado.setVisible(false);
        botonmuyarriesgado.setVisible(false);
        botonseguro.setVisible(false);
        botoncancelar.setVisible(false);
        botonatacar.setVisible(true);
        botoncurarse.setVisible(true);
    }

    @FXML
    private void clickseguro(){

        if(enemigo.estavivo(pokemon)){
        pokemon.ataqueseguro(enemigo);
        actualizarvida(barravidaene,enemigo);
        pokemon.estavivo(enemigo);}

        if (pokemon.estavivo(enemigo)){
        enemigo.ataqueseguro(pokemon);
        actualizarvida(barravidapok,pokemon);
        enemigo.estavivo(pokemon);
        if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);}
        } else{
            controlador1.actualizarvida1(pokemon);
        }

    }


    @FXML
    private void clickarriesgado(){

        if(enemigo.estavivo(pokemon)){
        pokemon.ataquepocoseguro(enemigo);
        actualizarvida(barravidaene,enemigo);
        pokemon.estavivo(enemigo);}

        if (pokemon.estavivo(enemigo)) {
            enemigo.ataquepocoseguro(pokemon);
            actualizarvida(barravidapok, pokemon);
            pokemon.estavivo(pokemon);
            if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);}
        }else{
            controlador1.actualizarvida1(pokemon);
        }

    }
    @FXML
    private void clickmuyarriesgado(){

        if (pokemon.estavivo(enemigo)) {
        pokemon.ataquenadaseguro(enemigo);
        actualizarvida(barravidaene,enemigo);
        pokemon.estavivo(enemigo);}

        if (pokemon.estavivo(enemigo)) {
            enemigo.ataquenadaseguro(pokemon);
            actualizarvida(barravidapok, pokemon);
            enemigo.estavivo(pokemon);
            if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);}
        }
        else{
            controlador1.actualizarvida1(pokemon);
        }

    }

    @FXML
    private void encimapspok(){
    pspok.setText(""+pokemon.getVidaact());
    }

    @FXML
    private void encimapsene(){
        psene.setText(""+enemigo.getVidaact());
    }

    @FXML
    private void salirpspok(){
        pspok.setText("PS");
    }

    @FXML
    private void salirpsene(){
        psene.setText("PS");
    }

    private void actualizarvida(ProgressBar actualizar, Pokemon pokemon){
        actualizar.setProgress((pokemon.getVidaact()*0.01));
    }


}



