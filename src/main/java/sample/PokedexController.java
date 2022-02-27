package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class PokedexController {
    Pokemon pokemon=null;
    @FXML
    Label nombrepokemon;
    @FXML
    Label descripcionpokemon;
    @FXML
    ImageView fotopokemon;
    @FXML
    ImageView base;
    @FXML
    ImageView evolucion1;
    @FXML
    ImageView evolucion2;

    @FXML
    ImageView estrella;

    @FXML
    private void initialize(){
        nombrepokemon.setText("Inserta el nombre del pokemon");
        descripcionpokemon.setText("ifhjasoufhasiouyfgasoifgasioyfagsfioyagsoiyagfoyuiasgfaosyuifgasoyuifaoyuifsifhjasoufhasiouyfgasoifgasioyfagsfioyagsoiyagfoyuiasgfaosyuifgasoyuifaoyuifszouifyasgouiyfasgfoyuiawfpyuiasfpyuiawfiuawehfiauowefhaiupfhaifhjasoufhasiouyfgasoifgasioyfagsfioyagsoiyagfoyuiasgfaosyuifgasoyuifaoyuifszouifyasgouiyfasgfoyuiawfpyuiasfpyuiawfiuawehfiauowefhaiupfhazouifyasgouiyfasgfoyuiawfpyuiasfpyuiawfiuawehfiauowefhaiupfha");

    }

    @FXML
    public void clickEstrella(){
        if (estrella.getOpacity()<0.9){estrella.setOpacity(1.0);
        pokemon.estrella.setVisible(true);}
        else {
            estrella.setOpacity(0.1);
            pokemon.estrella.setVisible(false);}


    }

    public void pasarPokemon(Pokemon pokemon) {
        this.pokemon=pokemon;
        nombrepokemon.setText(pokemon.getNombre());
        fotopokemon.setImage(pokemon.getImagen());
        descripcionpokemon.setText(pokemon.getDescripcion());
        evolucion1.setImage(pokemon.getImagen());
        base.setImage(pokemon.getEvolucion1());
    }



}
