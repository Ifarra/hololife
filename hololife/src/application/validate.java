package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class validate {
	
	@FXML
	private TextField idinput;
	@FXML
	private Button validbtn;
	@FXML
	private PasswordField passinput;
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	String userid;
	String userpass;
	
	public void valid (ActionEvent event) throws IOException {
		userid = idinput.getText();
		userpass = passinput.getText();
		
		if (userid.matches("user") && userpass.matches("userjuga")) {
			root  = FXMLLoader.load(getClass().getResource("Dash.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		}
		
	}
	
	
	
}
