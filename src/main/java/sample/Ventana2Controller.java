package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana2Controller {

Pokemon pokemon=null;
    String nivelaux = "Nv ";

    public Ventana2Controller() throws FileNotFoundException {
    }

    public void pasarPokemon(Pokemon pokemon) {
        this.pokemon=pokemon;
        nombrepok.setText(pokemon.getNombre());
        nivelpok.setText(nivelaux +pokemon.getNivel());
        barravidapok.setProgress((pokemon.getVidaact()*0.01));
        pok.setImage(pokemon.getImagenpelea());
    }
    ArrayList <Pokemon> listaenemigos = new ArrayList<>();
    Pokemon pokemon1 = new Pokemon(65,"Abomasnow",100,100, new Image(new FileInputStream(".\\src\\main\\resources\\reshiram.png")), new Image(new FileInputStream(".\\src\\main\\resources\\reshiramespalda.gif")));
    Pokemon pokemon2 = new Pokemon(47,"Avalugg",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\banano.png")),new Image(new FileInputStream(".\\src\\main\\resources\\bananoespalda.gif")));
    Pokemon pokemon3 = new Pokemon(32,"Glaceon",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\primeape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\primeapeespalda.gif")));
    Pokemon pokemon4 = new Pokemon(84,"Weavile",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\infernape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\infernapeespalda.gif")));
    Pokemon pokemon5 = new Pokemon(14,"Cloyster",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\rillaboom.png")),new Image(new FileInputStream(".\\src\\main\\resources\\rillaboomespalda.gif")));


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
    private void initialize(){

        listaenemigos.add(pokemon1);
        listaenemigos.add(pokemon2);
        listaenemigos.add(pokemon3);
        listaenemigos.add(pokemon4);
        listaenemigos.add(pokemon5);

    }



    @FXML
    private void clickcurar(){

    }

    @FXML
    private void clickatacar(){

        botonarriesgado.setVisible(true);
        botonmuyarriesgado.setVisible(true);
        botonseguro.setVisible(true);
        botoncancelar.setVisible(true);

    }

    @FXML
    private void clickcancelar(){
        botonarriesgado.setVisible(false);
        botonmuyarriesgado.setVisible(false);
        botonseguro.setVisible(false);
        botoncancelar.setVisible(false);
    }

    @FXML
    private void clickseguro(){

    }

    @FXML
    private void clickarriesgado(){

    }
    @FXML
    private void clickmuyarriesgado(){
        //pokemon.ataquenadaseguro();
    }
}


