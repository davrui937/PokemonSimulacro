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

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Ventana1Controller {

	ArrayList <Pokemon> listapokemon = new ArrayList<>();
	Pokemon pokemon1 = new Pokemon(65,"Reshiram",100,100, new Image(new FileInputStream(".\\src\\main\\resources\\reshiram.png")), new Image(new FileInputStream(".\\src\\main\\resources\\reshiramespalda.gif")));
	Pokemon pokemon2 = new Pokemon(47,"Banano",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\banano.png")),new Image(new FileInputStream(".\\src\\main\\resources\\bananoespalda.gif")));
	Pokemon pokemon3 = new Pokemon(32,"Macaco",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\primeape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\primeapeespalda.gif")));
	Pokemon pokemon4 = new Pokemon(84,"Infernape",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\infernape.png")),new Image(new FileInputStream(".\\src\\main\\resources\\infernapeespalda.gif")));
	Pokemon pokemon5 = new Pokemon(14,"Rillaboom",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\rillaboom.png")),new Image(new FileInputStream(".\\src\\main\\resources\\rillaboomespalda.gif")));
	Pokemon pokemon6 = new Pokemon(45,"Slaking",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\slaking.png")),new Image(new FileInputStream(".\\src\\main\\resources\\slakingespalda.gif")));


	ArrayList <Pokemon> listaenemigos = new ArrayList<>();
	Pokemon enemigo1 = new Pokemon(65,"Abomasnow",100,100, new Image(new FileInputStream(".\\src\\main\\resources\\abomasnow.gif")), new Image(new FileInputStream(".\\src\\main\\resources\\reshiramespalda.gif")));
	Pokemon enemigo2 = new Pokemon(47,"Avalugg",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\avalugg.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\bananoespalda.gif")));
	Pokemon enemigo3 = new Pokemon(32,"Glaceon",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\glaceon.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\primeapeespalda.gif")));
	Pokemon enemigo4 = new Pokemon(84,"Weavile",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\weavile.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\infernapeespalda.gif")));
	Pokemon enemigo5 = new Pokemon(14,"Cloyster",100,100,new Image(new FileInputStream(".\\src\\main\\resources\\cloyster.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\rillaboomespalda.gif")));

	Pokemon seleccion=null;

	@FXML
	Button botoncontinuar;


	//Primer Pokemon
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

	//Segundo Pokemon
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

	//Tercer Pokemon
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

	//Cuarto Pokemon
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

	//Quinto Pokemon
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

	//Sexto Pokemon
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

		listaenemigos.add(enemigo1);
		listaenemigos.add(enemigo2);
		listaenemigos.add(enemigo3);
		listaenemigos.add(enemigo4);
		listaenemigos.add(enemigo5);


		//PRIMER POKEMON
		nombre00.setText(pokemon1.getNombre());
		String NIVELAUX = "Nv ";
		nivel00.setText(NIVELAUX +pokemon1.getNivel());
		barravida00.setProgress((pokemon1.getVidaact()*0.01));
		vida00.setText(pokemon1.getVidaact()+"/"+ pokemon1.getVidamax());
		imagen00.setImage(pokemon1.getImagen());

		//SEGUNDO POKEMON
		nombre10.setText(pokemon2.getNombre());
		nivel10.setText(NIVELAUX +pokemon2.getNivel());
		barravida10.setProgress((pokemon2.getVidaact()*0.01));
		vida10.setText(pokemon2.getVidaact()+"/"+ pokemon2.getVidamax());
		imagen10.setImage(pokemon2.getImagen());


		//TERCERO POKEMON
		nombre20.setText(pokemon3.getNombre());
		nivel20.setText(NIVELAUX +pokemon3.getNivel());
		barravida20.setProgress((pokemon3.getVidaact()*0.01));
		vida20.setText(pokemon3.getVidaact()+"/"+ pokemon3.getVidamax());
		imagen20.setImage(pokemon3.getImagen());


		//CUARTO POKEMON
		nombre01.setText(pokemon4.getNombre());
		nivel01.setText(NIVELAUX +pokemon4.getNivel());
		barravida01.setProgress((pokemon4.getVidaact()*0.01));
		vida01.setText(pokemon4.getVidaact()+"/"+ pokemon4.getVidamax());
		imagen01.setImage(pokemon4.getImagen());


		//QUINTO POKEMON
		nombre11.setText(pokemon5.getNombre());
		nivel11.setText(NIVELAUX +pokemon5.getNivel());
		barravida11.setProgress((pokemon5.getVidaact()*0.01));
		vida11.setText(pokemon5.getVidaact()+"/"+ pokemon5.getVidamax());
		imagen11.setImage(pokemon5.getImagen());

		//SEXTO POKEMON
		nombre21.setText(pokemon6.getNombre());
		nivel21.setText(NIVELAUX +pokemon6.getNivel());
		barravida21.setProgress((pokemon6.getVidaact()*0.01));
		vida21.setText(pokemon6.getVidaact()+"/"+ pokemon6.getVidamax());
		imagen21.setImage(pokemon6.getImagen());
	}


	@FXML
	private void clickpokemon00(){
		botonmostrar();
		pok00.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon1;
		}

	@FXML
	private void clickpokemon10(){
		botonmostrar();
		pok10.setStyle("-fx-background-color: #A99DB0");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon2;
	}

	@FXML
	private void clickpokemon20(){
		botonmostrar();
		pok20.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon3;
	}

	@FXML
	private void clickpokemon01(){
		botonmostrar();
		pok01.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon4;
	}

	@FXML
	private void clickpokemon11(){
		botonmostrar();
		pok11.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		pok21.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon5;
	}

	@FXML
	private void clickpokemon21(){
		botonmostrar();
		pok21.setStyle("-fx-background-color: #A99DB0");
		pok10.setStyle("-fx-background-color: #7D6A87");
		pok20.setStyle("-fx-background-color: #7D6A87");
		pok01.setStyle("-fx-background-color: #7D6A87");
		pok11.setStyle("-fx-background-color: #7D6A87");
		pok00.setStyle("-fx-background-color: #7D6A87");
		seleccion=pokemon6;
	}

	private void botonmostrar(){
		botoncontinuar.setVisible(true);
	}



	public void actualizarvida1(Pokemon pokemon){
		seleccion.setVidaact(pokemon.getVidaact());
		initialize();
	}

	private Ventana2Controller v = null;
	private Stage stage = null;


	@FXML
	protected void clickContinuar() {
		int aleatorio= (int) (Math.random()*5);
		Pokemon enem= listaenemigos.get(aleatorio);

		try {
			if (stage == null || !stage.isShowing()) {
				stage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("/Ventana2.fxml"));
				BorderPane root = loader.load();
				Scene scene = new Scene(root, 750,500);
				stage.setResizable(false);
				stage.setScene(scene);
				stage.show();

				v = loader.getController();

				v.pasarPokemon(seleccion,enem);
				v.recibircontrolador(this);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}