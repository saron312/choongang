package exam;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class sr implements Initializable {
	@FXML private TextField txtName;
	@FXML private TextField txtKorean;
	@FXML private TextField txtMath;
	@FXML private TextField txtEnglish;
	@FXML private Button btnAdd;
	@FXML private Button btnAver;
	@FXML private Button btnBar;
	@FXML private Button btnCancel;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnAction(ActionEvent e) {
		
		String id = ((Node) e.getSource()).getId();
		//System.out.println(id);
		
		String name = txtName.getText();
		System.out.println("이름 : " + name);

		String Korean = txtKorean.getText();
		int kor = Integer.parseInt(Korean);
		System.out.println("국어 = " + kor);
		
		String Math = txtMath.getText();
		int mat = Integer.parseInt(Math);
		System.out.println("수학 = " + mat);
		
		String English = txtEnglish.getText();
		int eng = Integer.parseInt(English);
		System.out.println("영어 = " + eng);
		
		int Add = kor + mat + eng;
		double Aver = Add/3.0 ;
		
		if (id.equals("btnAdd")) {
			System.out.println("총점");
			System.out.println(Add);
		} 
		if (id.equals("btnAver")) {
			System.out.println("평균");
			System.out.println(Aver);
		}
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(btnBar.getScene().getWindow());
		dialog.setTitle("추가");
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("barchart.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);	
			dialog.show();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
