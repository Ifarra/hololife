package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Records extends Main{

    
    @FXML
    private Button logout;

    @FXML
    private TextField indate;

    @FXML
    private TextField innominal;

    @FXML
    private TextField inopt;

    @FXML
    private Label inputlbl;

    @FXML
    private Button submit;
    
    @FXML
    private Button backtodash;

    
    private Stage stage;
	private Scene scene;
	private Parent root;
	
	private String opt;
	private String nml;
	private String dat;
	
	Controllbl myCtrllbl = new Controllbl();
	Controllbl.Labelcls addlblopt = myCtrllbl.new Labelcls();
	Controllbl.dateaddtotal addlbldate = myCtrllbl.new dateaddtotal();
	Controllbl.labeladdtotal addlblnum = myCtrllbl.new labeladdtotal();
	
    public void logout (ActionEvent e) throws IOException {
    	root  = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		stage.setTitle("Hololife - Personal dashboard");
		stage.setResizable(false);
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    public void submit (ActionEvent e) throws IOException {
    	root  = FXMLLoader.load(getClass().getResource("Dash.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		stage.setTitle("Hololife - Personal dashboard");
		stage.setResizable(false);
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    	
    	opt = inopt.getText();
    	nml = innominal.getText();
    	dat = indate.getText();
    	
    	if (opt.matches("Savings") || opt.matches("savings")) {
    		addlblopt.addlbl(opt);
        	addlbldate.addlbl(dat);
        	addlblnum.addlbl(nml);
    	} else {
    	addlblopt.addlblsv(opt);
    	addlbldate.addlblsv(dat);
    	addlblnum.addlblsv(nml);
    	}
    }

    public void backtodash (ActionEvent e) throws IOException {
    	root  = FXMLLoader.load(getClass().getResource("Dash.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		stage.setTitle("Hololife - Personal dashboard");
		stage.setResizable(false);
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    
    
}
