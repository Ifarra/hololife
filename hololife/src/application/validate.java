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
	
	
	// Abstraction #2
	public class val1 extends User{
		String user = "user";
		String pass = "userjuga";
		String log (){
			String validd = user+pass;
			return validd;
		}
	}
	public class val2 extends User{
		String user = "reine";
		String pass = "wangy";
		String log (){
			String validd = user+pass;
			return validd;
		}
	}
	public class val3 extends User{
		String user = "ayunda";
		String pass = "risu";
		String log (){
			String validd = user+pass;
			return validd;
		}
	}
	String userid;
	String userpass;
	String userplus;
	
	public void valid (ActionEvent event) throws IOException {
		userid = idinput.getText();
		userpass = passinput.getText();
		userplus = userid+userpass;
		val1 u1 = new val1();
		val2 u2 = new val2();
		val3 u3 = new val3();
		
		if (u1.log().matches(userplus) || u2.log().matches(userplus) || u3.log().matches(userplus)) {
			root  = FXMLLoader.load(getClass().getResource("Dash.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			stage.setTitle("Hololife - Personal dashboard");
			stage.setResizable(false);
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
	}
	
	
	
	
}
