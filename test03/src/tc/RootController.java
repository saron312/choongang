package tc;

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

public class RootController implements Initializable {
	@FXML private TextField txtName;
	@FXML private TextField txtKor;
	@FXML private TextField txtMath;
	@FXML private TextField txtEng;
	@FXML private Button btnAdd;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public void handleBtnRegAction(ActionEvent e) {
		
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(btnAdd.getScene().getWindow());
		dialog.setTitle("추가");
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("barchart.fxml"));
			Scene scene = new Scene(parent);
			dialog.setScene(scene);
			dialog.setResizable(false);	
			dialog.show();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		String sName = txtName.getText();
		System.out.println("이름: " + sName);
		
		String sKor = txtKor.getText();
		System.out.println("국어: " + sKor);
		
		String sMath = txtMath.getText();
		System.out.println("수학: " + sMath);
		
		String sEng = txtEng.getText();
		System.out.println("영어: " + sEng);
		
		int iKor = Integer.parseInt(sKor);
		int iMath = Integer.parseInt(sMath);
		int iEng = Integer.parseInt(sEng);
		int sum = iKor + iMath + iEng;     // 국어, 수학, 영어 총점
		System.out.println("총점: " + sum);
		float avg = (float) (sum/3.0);   // 평균
		System.out.println("평균: " + avg);

	}
	
	public void handleBtnCancelAction(ActionEvent e) {
		Platform.exit();
	}
}
