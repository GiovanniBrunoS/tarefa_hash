package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class TelaUsuarioController implements Initializable{
	@FXML
	private AnchorPane anchorPane;
	@FXML
	private Button btnVoltar;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btnVoltar.setDefaultButton(true);
		
		btnVoltar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {	
					Parent parent = FXMLLoader.load(getClass().getResource("../view/TelaLogin.fxml"));
					Scene scene = new Scene(parent);
					Stage stage = (Stage) anchorPane.getScene().getWindow();
					stage.setScene(scene);
					
				} catch (IOException e) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Erro");
					alert.setHeaderText(null);
					alert.setContentText("Ocorreu um erro, inicie o programa novamente");
					alert.showAndWait();
					Platform.exit();
				}
			}
		});
	}

}
