package sec07.exam02_input;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField txtTitle;
	@FXML private TextField txtKor;
	@FXML private TextField txtEng;
	@FXML private TextField txtMath;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnAction(ActionEvent e) {
		
		String id = ((Node) e.getSource()).getId();
		//System.out.println(id);
		
		String name = txtTitle.getText();
		System.out.println("이름 : " + name);

		String title1 = txtKor.getText();
		int a = Integer.parseInt(title1);
		System.out.println("국어 : " + a);
		
		String title2 = txtEng.getText();
		int b = Integer.parseInt(title2);
		System.out.println("영어 : " + b);
		
		String title3 = txtMath.getText();
		int c = Integer.parseInt(title3);
		System.out.println("수학 : " + c);
		
		int Add = a + b + c;
		int Average = Add/3 ;
		
		if (id.equals("btnAdd")) {
			System.out.println("총점");
			System.out.println(Add);
		} 
		if (id.equals("btnAverage")) {
			System.out.println("평균");

			System.out.println(Average);
		}
	} 
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
