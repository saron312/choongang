package sec07.exam02_input;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private TextField txtNum;
	@FXML private Button btnReg;
	@FXML private Button btnReg2;
	@FXML private Button btnCancel;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		
		
		String a = txtTitle.getText();
		int x = Integer.parseInt(a);
		System.out.println("숫자1: " + a);
		
		
		String b = txtNum.getText();
		int y = Integer.parseInt(b);
		System.out.println("숫자2: " + b);
		
		System.out.println("더하기");
		int sum = x + y;
		System.out.println(sum);
		System.out.println("--------");
	}
	
	public void handleBtnReg2Action(ActionEvent e) {
		
		String c = txtTitle.getText();
		int q = Integer.parseInt(c);
		System.out.println("숫자1: " + c);
		
		String d = txtNum.getText();
		int w = Integer.parseInt(d);
		System.out.println("숫자2: " + d);
		
		System.out.println("빼기");
		int subb = q - w;
		System.out.println(subb);
		System.out.println("--------");
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
