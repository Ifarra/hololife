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
import javafx.stage.Stage;

public class Controllbl extends Main{
	
    @FXML
    private Label datelbldua;

    @FXML
    private Label datelblsatu;

    @FXML
    private Label datelbltiga;

    @FXML
    private Button expenses;

    @FXML
    private Label expenseslbl;

    @FXML
    private Button logout;

    @FXML
    private Label optionlbldua;

    @FXML
    private Label optionlblsatu;

    @FXML
    private Label optionlbltiga;

    @FXML
    private Button savings;

    @FXML
    private Label savingslbl;

    @FXML
    private Label totallbldua;

    @FXML
    private Label totallblsatu;

    @FXML
    private Label totallbltiga;
    
    private Stage stage;
   	private Scene scene;
   	private Parent root;
	
	public class Labelcls {
    	public void addlbl(String lbl) {
    		optionlbltiga.setText(optionlbldua.getText());
    		optionlbldua.setText(optionlblsatu.getText());
    		optionlblsatu.setText(lbl);
    	}
    }
    public class labeladdtotal extends Labelcls {
    	public void addlbl(String lbl) {
    		totallbltiga.setText(totallbldua.getText());
    		totallbldua.setText(totallblsatu.getText());
    		totallblsatu.setText(lbl);
    	}
    }
    public class dateaddtotal extends Labelcls {
    	public void addlbl(String lbl) {
    		datelbltiga.setText(datelbldua.getText());
    		datelbldua.setText(datelblsatu.getText());
    		datelblsatu.setText(lbl);
    	}
    }
    
    public void logout (ActionEvent e) throws IOException {
    	root  = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		stage.setTitle("Hololife - Personal dashboard");
		stage.setResizable(false);
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    public void expenses (ActionEvent ev) throws IOException {
    	root  = FXMLLoader.load(getClass().getResource("Records.fxml"));
		stage = (Stage)((Node)ev.getSource()).getScene().getWindow();
		stage.setTitle("Hololife - Personal dashboard");
		stage.setResizable(false);
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
    }
    
    
}
