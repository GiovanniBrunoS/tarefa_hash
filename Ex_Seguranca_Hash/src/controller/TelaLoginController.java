package controller;

import java.io.IOException;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
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
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.Usuario;

public class TelaLoginController implements Initializable {

	@FXML
	private TextField txtLogin, txtSenha;
	@FXML
	private Button btnLogin, btnCadastro;
	@FXML
	private AnchorPane anchorPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnCadastro.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				try {
					Parent parent = FXMLLoader.load(getClass().getResource("../view/TelaCadastro.fxml"));
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

		btnLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				try {
					Usuario usuario = new Usuario(txtLogin.getText(), txtSenha.getText());
					if (usuario.checarUsuario()) {
						Parent parent = FXMLLoader.load(getClass().getResource("../view/TelaUsuario.fxml"));
						Scene scene = new Scene(parent);
						Stage stage = (Stage) anchorPane.getScene().getWindow();
						stage.setScene(scene);
					} else {
						Alert alert = new Alert(AlertType.WARNING);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Usuario não encontrado");
						alert.setHeaderText(null);
						alert.setContentText("Login ou senha incorretos, tente novamente");
						alert.showAndWait();
					}
				} catch (NoSuchAlgorithmException | IOException e1) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Erro");
					alert.setHeaderText(null);
					alert.setContentText("Ocorreu um erro, inicie o programa novamente");
					alert.showAndWait();
					Platform.exit();
				} catch(NullPointerException e2) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Usuario não encontrado");
					alert.setHeaderText(null);
					alert.setContentText("Login ou senha incorretos, tente novamente");
					alert.showAndWait();
				}
			}
		});
		
		txtSenha.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				try {
					Usuario usuario = new Usuario(txtLogin.getText(), txtSenha.getText());
					if (usuario.checarUsuario()) {
						Parent parent = FXMLLoader.load(getClass().getResource("../view/TelaUsuario.fxml"));
						Scene scene = new Scene(parent);
						Stage stage = (Stage) anchorPane.getScene().getWindow();
						stage.setScene(scene);
					} else {
						Alert alert = new Alert(AlertType.WARNING);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Usuario não encontrado");
						alert.setHeaderText(null);
						alert.setContentText("Login ou senha incorretos, tente novamente");
						alert.showAndWait();
					}
				} catch (NoSuchAlgorithmException | IOException e1) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Erro");
					alert.setHeaderText(null);
					alert.setContentText("Ocorreu um erro, inicie o programa novamente");
					alert.showAndWait();
					Platform.exit();
				} catch(NullPointerException e2) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Usuario não encontrado");
					alert.setHeaderText(null);
					alert.setContentText("Login ou senha incorretos, tente novamente");
					alert.showAndWait();
				}
			}
		});
		
		txtLogin.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {

				try {
					Usuario usuario = new Usuario(txtLogin.getText(), txtSenha.getText());
					if (usuario.checarUsuario()) {
						Parent parent = FXMLLoader.load(getClass().getResource("../view/TelaUsuario.fxml"));
						Scene scene = new Scene(parent);
						Stage stage = (Stage) anchorPane.getScene().getWindow();
						stage.setScene(scene);
					} else {
						Alert alert = new Alert(AlertType.WARNING);
						alert.initStyle(StageStyle.UTILITY);
						alert.setTitle("Usuario não encontrado");
						alert.setHeaderText(null);
						alert.setContentText("Login ou senha incorretos, tente novamente");
						alert.showAndWait();
					}
				} catch (NoSuchAlgorithmException | IOException e1) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Erro");
					alert.setHeaderText(null);
					alert.setContentText("Ocorreu um erro, inicie o programa novamente");
					alert.showAndWait();
					Platform.exit();
				} catch(NullPointerException e2) {
					Alert alert = new Alert(AlertType.WARNING);
					alert.initStyle(StageStyle.UTILITY);
					alert.setTitle("Usuario não encontrado");
					alert.setHeaderText(null);
					alert.setContentText("Login ou senha incorretos, tente novamente");
					alert.showAndWait();
				}
			}
		});
	}
}
