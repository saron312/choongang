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
	@FXML private TextField txtNum;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnAction(ActionEvent e) {
		
		String id = ((Node) e.getSource()).getId();
		System.out.println(id);

		String title1 = txtTitle.getText();
		int a = Integer.parseInt(title1);
		System.out.println("숫자1: " + a);
		
		String title2 = txtNum.getText();
		int b = Integer.parseInt(title2);
		System.out.println("숫자2: " + b);
		
		if (id.equals("btnAdd")) {
			System.out.println("더하기");
			int Add = a + b;
			System.out.println(Add);
		} 
		if (id.equals("btnMinus")) {
			System.out.println("빼기");
			int Minus = a - b;
			System.out.println(Minus);
		}
		if (id.equals("btnMulti")) {
			System.out.println("곱하기");
			int Multi = a * b;
			System.out.println(Multi);
		}
	}
	
	/*
	public void handleBtnAddAction(ActionEvent e) {
		
		String id = ((Node) e.getSource()).getId();
		System.out.println(id);

		String title1 = txtTitle.getText();
		int a = Integer.parseInt(title1);
		System.out.println("숫자1: " + a);
		
		String title2 = txtNum.getText();
		int b = Integer.parseInt(title2);
		int Add = a+b;
		System.out.println("숫자2: " + b);
		System.out.println(Add);
		
	}
	
	public void handleBtnMinusAction(ActionEvent e) {
		String title1 = txtTitle.getText();
		int a = Integer.parseInt(title1);
		System.out.println("숫자1: " + a);
		
		String title2 = txtNum.getText();
		int b = Integer.parseInt(title2);
		int Minus = a-b;
		System.out.println("숫자2: " + b);
		System.out.println(Minus);
		
	}
	
	public void handleBtnMultiAction(ActionEvent e) {
		String title1 = txtTitle.getText();
		int a = Integer.parseInt(title1);
		System.out.println("숫자1: " + a);
		
		String title2 = txtNum.getText();
		int b = Integer.parseInt(title2);
		int Multi = a*b;
		System.out.println("숫자2: " + b);
		System.out.println(Multi);
		
	}*/
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
