package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
    private Label datelblsatu;
    
    @FXML
    private Label datelblsatu1;

    @FXML
    private Button expenses;

    @FXML
    private Label expenseslbl;

    @FXML
    private Button logout;

    @FXML
    private Label optionlblsatu;
    
    @FXML
    private Label optionlblsatu1;

    @FXML
    private Button savings;

    @FXML
    private Label savingslbl;

    @FXML
    private Label totallblsatu;
    
    @FXML
    private Label totallblsatu1;

    
    @FXML
    private Button refresh;
    
    private Stage stage;
   	private Scene scene;
   	private Parent root;
   	static int sv;
   	static int ex;
	
	public class Labelcls {
		public void addlbl (String lbl) throws IOException {
			BufferedWriter optwr = new BufferedWriter(new FileWriter("satuopttxt.txt"));
			optwr.write(lbl);
			optwr.close();
    	}
		public void addlblsv (String lbl) throws IOException {
			BufferedWriter optwr = new BufferedWriter(new FileWriter("svsatuopttxt.txt"));
			optwr.write(lbl);
			optwr.close();
    	}
    }
    public class labeladdtotal extends Labelcls {
    	public void addlbl (String lbl) throws IOException  {
    		BufferedWriter totalwr = new BufferedWriter(new FileWriter("totaltxt.txt"));
			totalwr.write(lbl);
			totalwr.close();
			PrintWriter printtotalrd = new PrintWriter(new FileWriter("lbltotaltxt.txt", true));
			BufferedReader totalrd = new BufferedReader(new FileReader("lbltotaltxt.txt"));
			sv = Integer.valueOf(lbl) + Integer.valueOf(totalrd.readLine());
			totalrd.close();
			BufferedWriter lbltotalwr = new BufferedWriter(new FileWriter("lbltotaltxt.txt"));
			printtotalrd.print(sv);
			printtotalrd.close();
			lbltotalwr.close();
    	}
    	public void addlblsv (String lbl) throws IOException  {
    		BufferedWriter totalwr = new BufferedWriter(new FileWriter("svtotaltxt.txt"));
			totalwr.write(lbl);
			totalwr.close();
			PrintWriter printtotalrd = new PrintWriter(new FileWriter("svlbltotaltxt.txt", true));
			BufferedReader totalrd = new BufferedReader(new FileReader("svlbltotaltxt.txt"));
			ex = Integer.valueOf(lbl) + Integer.valueOf(totalrd.readLine());
			totalrd.close();
			BufferedWriter lbltotalwr = new BufferedWriter(new FileWriter("svlbltotaltxt.txt"));
			printtotalrd.print(ex);
			printtotalrd.close();
			lbltotalwr.close();
    	}
    }
    public class dateaddtotal extends Labelcls {
    	public void addlbl (String lbl) throws IOException {
    		BufferedWriter datewr = new BufferedWriter(new FileWriter("datetxt.txt"));
			datewr.write(lbl);
			datewr.close();
    	}
    	public void addlblsv (String lbl) throws IOException {
    		BufferedWriter datewr = new BufferedWriter(new FileWriter("svdatetxt.txt"));
			datewr.write(lbl);
			datewr.close();
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
    
    public void refresh (ActionEvent e) throws IOException {
    	BufferedReader optrd = new BufferedReader(new FileReader("satuopttxt.txt"));
		optionlblsatu.setText(optrd.readLine());
    	optrd.close();
    	
    	BufferedReader totalrd = new BufferedReader(new FileReader("totaltxt.txt"));
		totallblsatu.setText(totalrd.readLine());
		totalrd.close();
		
		BufferedReader daterd = new BufferedReader(new FileReader("datetxt.txt"));
		datelblsatu.setText(daterd.readLine());
		daterd.close();
		
		BufferedReader optrdsv = new BufferedReader(new FileReader("svsatuopttxt.txt"));
		optionlblsatu1.setText(optrdsv.readLine());
    	optrdsv.close();
    	
    	BufferedReader totalrdsv = new BufferedReader(new FileReader("svtotaltxt.txt"));
		totallblsatu1.setText(totalrdsv.readLine());
		totalrdsv.close();
		
		BufferedReader daterdsv = new BufferedReader(new FileReader("svdatetxt.txt"));
		datelblsatu1.setText(daterdsv.readLine());
		daterdsv.close();
		
		BufferedReader lbltotalrdsv = new BufferedReader(new FileReader("svlbltotaltxt.txt"));
		expenseslbl.setText("Rp " + lbltotalrdsv.readLine());
		lbltotalrdsv.close();
		
		BufferedReader lbltotalrd = new BufferedReader(new FileReader("lbltotaltxt.txt"));
		savingslbl.setText("Rp " + lbltotalrd.readLine());
		lbltotalrd.close();
    }
    
}

