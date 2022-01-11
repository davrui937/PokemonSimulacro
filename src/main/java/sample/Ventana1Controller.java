package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana1Controller {

	private final String NIVELAUX= "Nv ";

	ArrayList <Pokemon> listapokemon = new ArrayList<>();
	Pokemon pokemon1 = new Pokemon(65,"Reshiram",100,60, new Image(new FileInputStream(".\\src\\main\\resources\\reshiram.png")));
	Pokemon pokemon2 = new Pokemon(47,"Banano",100,20,new Image(new FileInputStream(".\\src\\main\\resources\\banano.png")));
	Pokemon pokemon3 = new Pokemon(32,"Macaco",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\primeape.png")));
	Pokemon pokemon4 = new Pokemon(84,"Infernape",100,80,new Image(new FileInputStream(".\\src\\main\\resources\\infernape.png")));
	Pokemon pokemon5 = new Pokemon(14,"Rillaboom",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\rillaboom.png")));
	Pokemon pokemon6 = new Pokemon(45,"Slaking",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\slaking.png")));


	@FXML
	AnchorPane pok00;
	@FXML
	Label nombre00;

	@FXML
	Label nivel00;

	@FXML
	ProgressBar barravida00;

	@FXML
	Label vida00;

	@FXML
	ImageView imagen00;


	@FXML
	AnchorPane pok10;

	@FXML
	Label nombre10;

	@FXML
	Label nivel10;

	@FXML
	ProgressBar barravida10;

	@FXML
	Label vida10;

	@FXML
	ImageView imagen10;


	@FXML
	AnchorPane pok20;

	@FXML
	Label nombre20;

	@FXML
	Label nivel20;

	@FXML
	ProgressBar barravida20;

	@FXML
	Label vida20;

	@FXML
	ImageView imagen20;


	@FXML
	AnchorPane pok01;

	@FXML
	Label nombre01;

	@FXML
	Label nivel01;

	@FXML
	ProgressBar barravida01;

	@FXML
	Label vida01;

	@FXML
	ImageView imagen01;


	@FXML
	AnchorPane pok11;

	@FXML
	Label nombre11;

	@FXML
	Label nivel11;

	@FXML
	ProgressBar barravida11;

	@FXML
	Label vida11;

	@FXML
	ImageView imagen11;

	@FXML
	AnchorPane pok21;

	@FXML
	Label nombre21;

	@FXML
	Label nivel21;

	@FXML
	ProgressBar barravida21;

	@FXML
	Label vida21;

	@FXML
	ImageView imagen21;

	public Ventana1Controller() throws FileNotFoundException {
	}

	@FXML
	private void initialize(){
		listapokemon.add(pokemon1);
		listapokemon.add(pokemon2);
		listapokemon.add(pokemon3);
		listapokemon.add(pokemon4);
		listapokemon.add(pokemon5);
		listapokemon.add(pokemon6);

		//PRIMER POKEMON
		nombre00.setText(pokemon1.getNombre());
		nivel00.setText(NIVELAUX+pokemon1.getNivel());
		barravida00.setProgress((pokemon1.getVidaact()*0.01));
		vida00.setText(pokemon1.getVidaact()+"/"+ pokemon1.getVidamax());
		imagen00.setImage(pokemon1.getImagen());

		//SEGUNDO POKEMON
		nombre10.setText(pokemon2.getNombre());
		nivel10.setText(NIVELAUX+pokemon2.getNivel());
		barravida10.setProgress((pokemon2.getVidaact()*0.01));
		vida10.setText(pokemon2.getVidaact()+"/"+ pokemon2.getVidamax());
		imagen10.setImage(pokemon2.getImagen());


		//TERCERO POKEMON
		nombre20.setText(pokemon3.getNombre());
		nivel20.setText(NIVELAUX+pokemon3.getNivel());
		barravida20.setProgress((pokemon3.getVidaact()*0.01));
		vida20.setText(pokemon3.getVidaact()+"/"+ pokemon3.getVidamax());
		imagen20.setImage(pokemon3.getImagen());


		//CUARTO POKEMON
		nombre01.setText(pokemon4.getNombre());
		nivel01.setText(NIVELAUX+pokemon4.getNivel());
		barravida01.setProgress((pokemon4.getVidaact()*0.01));
		vida01.setText(pokemon4.getVidaact()+"/"+ pokemon4.getVidamax());
		imagen01.setImage(pokemon4.getImagen());


		//QUINTO POKEMON
		nombre11.setText(pokemon5.getNombre());
		nivel11.setText(NIVELAUX+pokemon5.getNivel());
		barravida11.setProgress((pokemon5.getVidaact()*0.01));
		vida11.setText(pokemon5.getVidaact()+"/"+ pokemon5.getVidamax());
		imagen11.setImage(pokemon5.getImagen());

		//SEXTO POKEMON
		nombre21.setText(pokemon6.getNombre());
		nivel21.setText(NIVELAUX+pokemon6.getNivel());
		barravida21.setProgress((pokemon6.getVidaact()*0.01));
		vida21.setText(pokemon6.getVidaact()+"/"+ pokemon6.getVidamax());
		imagen21.setImage(pokemon6.getImagen());
	}


	@FXML
	private void clickpokemon00(){
		pok00.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
	}

	@FXML
	private void clickpokemon10(){
		pok10.setStyle("-fx-background-color: #A99DB0");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
	}

	@FXML
	private void clickpokemon20(){

		pok20.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
	}

	@FXML
	private void clickpokemon01(){
		pok01.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
	}

	@FXML
	private void clickpokemon11(){
		pok11.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
	}

	@FXML
	private void clickpokemon21(){
		pok21.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
	}

}