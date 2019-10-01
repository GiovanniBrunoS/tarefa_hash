package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application{
	
	@Override
	public void start(Stage stage) {
		try {			
			Parent parent =	FXMLLoader.load(getClass().getResource("../view/TelaLogin.fxml")); 
			Scene scene = new Scene(parent); 
			stage.setTitle("Funcao Hash");
			stage.setResizable(false); 
			stage.initStyle(StageStyle.UTILITY); 
			stage.setScene(scene); 
			stage.show(); 

		} catch (IOException e) {
			Alert alert = new Alert(AlertType.WARNING);
			alert.setTitle("Warning Dialog");
			alert.setHeaderText("Look, a Warning Dialog");
			alert.setContentText("Careful with the next step!");
			alert.showAndWait();
		}
	}
	
	@Override
	public void stop(){
	    System.exit(0);
	}

	public static void main(String[] args) {
		launch(args);
	}

}
