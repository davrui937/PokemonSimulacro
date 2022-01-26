package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Optional;

public class Ventana2Controller {

    Pokemon pokemon=null;
    Pokemon enemigo=null;
    String nivelaux = "Nv ";

    Ventana1Controller controlador1=null;

    public void recibircontrolador(Ventana1Controller controlador1){this.controlador1=controlador1;}

    private void showAlert(Alert alert) {
        Optional<ButtonType> resultado = alert.showAndWait();
        if(!resultado.isPresent()) {
            System.out.println("Dialogo cerrado con la X");
        } else if(resultado.get() == ButtonType.PREVIOUS) {
            controlador1.stage.close();
        } else if (resultado.get() == ButtonType.CLOSE) {
            System.exit(1);
        } else {
            System.out.println("Resultado = OTROS: " + resultado.get().getText());
        }
    }

    private void alertaMuerte(Pokemon pokemon){

        Alert customAlert = new Alert(Alert.AlertType.NONE);
        customAlert.setTitle("Pokemon eliminado");
        customAlert.setContentText("El pokemon "+ pokemon.getNombre()+" ha sido eliminado.");
        customAlert.setGraphic(new ImageView(pokemon.getImagen()));
        customAlert.getDialogPane().getButtonTypes().addAll(ButtonType.PREVIOUS, ButtonType.CLOSE);
        showAlert(customAlert);
    }



    public void pasarPokemon(Pokemon pokemon, Pokemon enemigo) {
        this.pokemon=pokemon;
        this.enemigo=enemigo;

        nombrepok.setText(pokemon.getNombre());
        nivelpok.setText(nivelaux +pokemon.getNivel());
        barravidapok.setProgress(((double) pokemon.getVidaact()/pokemon.getVidamax()));
        pok.setImage(pokemon.getImagenpelea());

        nombreene.setText(enemigo.getNombre());
        nivelene.setText(nivelaux +enemigo.getNivel());
        barravidaene.setProgress(((double) enemigo.getVidaact()/enemigo.getVidamax()));
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
        else {alertaMuerte(pokemon);}

        if (pokemon.estavivo(enemigo)){
        enemigo.ataqueseguro(pokemon);
        actualizarvida(barravidapok,pokemon);
        enemigo.estavivo(pokemon);
        if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);
            alertaMuerte(pokemon);}
        } else{
            controlador1.actualizarvida1(pokemon);
            alertaMuerte(enemigo);
        }

    }


    @FXML
    private void clickarriesgado(){

        if(enemigo.estavivo(pokemon)){
        pokemon.ataquepocoseguro(enemigo);
        actualizarvida(barravidaene,enemigo);
        pokemon.estavivo(enemigo);}
        else {alertaMuerte(pokemon);}

        if (pokemon.estavivo(enemigo)) {
            enemigo.ataquepocoseguro(pokemon);
            actualizarvida(barravidapok, pokemon);
            pokemon.estavivo(pokemon);
            if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);
                alertaMuerte(pokemon);}
        }else{
            controlador1.actualizarvida1(pokemon);
            alertaMuerte(enemigo);
        }

    }
    @FXML
    private void clickmuyarriesgado(){

        if (enemigo.estavivo(pokemon)) {
        pokemon.ataquenadaseguro(enemigo);
        actualizarvida(barravidaene,enemigo);
        pokemon.estavivo(enemigo);}

        if (pokemon.estavivo(enemigo)) {
            enemigo.ataquenadaseguro(pokemon);
            actualizarvida(barravidapok, pokemon);
            enemigo.estavivo(pokemon);
            if(!enemigo.estavivo(pokemon)){controlador1.actualizarvida1(pokemon);
                alertaMuerte(pokemon);}
        }
        else{
            controlador1.actualizarvida1(pokemon);
            alertaMuerte(enemigo);
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
        actualizar.setProgress(((double) pokemon.getVidaact()/pokemon.getVidamax()));
        if(actualizar.getProgress()>0.8){actualizar.setStyle("-fx-accent: #44E747;");}
        if (actualizar.getProgress()<0.7 && actualizar.getProgress()>0.5){actualizar.setStyle("-fx-accent: #F3E000;"); }
        if (actualizar.getProgress()<0.5 && actualizar.getProgress()>0.2){actualizar.setStyle("-fx-accent: #E88E1C;"); }
        if (actualizar.getProgress()<0.2){actualizar.setStyle("-fx-accent: #B10709"); }

        controlador1.quitarclick();
    }


}



