package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.util.ArrayList;

public class Ventana1Controller {

	private final String NIVELAUX= "Nv ";

	ArrayList <Pokemon> listapokemon = new ArrayList<Pokemon>();
	Pokemon pokemon1 = new Pokemon(65,"Reshiram",100,100);
	Pokemon pokemon2 = new Pokemon(47,"Banano",100,100);
	Pokemon pokemon3 = new Pokemon(32,"Macaco",100,100);
	Pokemon pokemon4 = new Pokemon(84,"Infernape",100,100);
	Pokemon pokemon5 = new Pokemon(14,"Rillaboom",100,100);
	Pokemon pokemon6 = new Pokemon(45,"Slaking",100,100);



	@FXML
	Label nombre00;

	@FXML
	Label nivel00;

	@FXML
	ProgressBar barravida00;

	@FXML
	private void initialize(){
		listapokemon.add(pokemon1);
		listapokemon.add(pokemon2); 
		listapokemon.add(pokemon3);
		listapokemon.add(pokemon4);
		listapokemon.add(pokemon5);
		listapokemon.add(pokemon6);

		nombre00.setText(pokemon1.getNombre());
		nivel00.setText(NIVELAUX+pokemon1.getNivel());
		barravida00.setProgress(pokemon1.getVidaact());
	}

	@FXML
	private void onButtonAbrirClicked() {
		System.out.println("Botón pulsado");

	}

	@FXML
	private void pokemon00(){

	}

}