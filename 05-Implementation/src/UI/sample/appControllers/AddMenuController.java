package UI.sample.appControllers;

import Logic.DasherDexCon;
import Logic.Pokemon;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class AddMenuController {
    public Button addedButton = new Button();
    public TextField addNameField = new TextField();
    public TextField addTypeField = new TextField();
    public TextField addEvolutionField = new TextField();
    public TextField addWeaknessField = new TextField();

    Pokemon pi = new Pokemon();
    DasherDexCon addPokemon = new DasherDexCon();

    public void addedButtonAction(ActionEvent addButtonEvent) throws IOException, SQLException {
        addPokemon.DasherDexCon(addNameField.getText(),addTypeField.getText());
        //pi.addPokemon(addNameField.getText(), addTypeField.getText());
        Stage stage = (Stage) addedButton.getScene().getWindow();
        stage.close();
    }
}
