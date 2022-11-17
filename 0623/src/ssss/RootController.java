package ssss;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private TextField tf1;
    @FXML private TextField tf2;
    EmpDao ed;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ed = new EmpDao();
		try {
			ed.connect();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		btn1.setOnAction(e->{
			try {
				handle1(e);
			} catch (Exception e1) {
				e1.printStackTrace();
			} 
		});
		btn2.setOnAction(e->{
			try {
				handle2(e);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		});
		
	}

	private void handle2(ActionEvent e) throws SQLException {
		Emp emp = new Emp(Integer.parseInt(tf1.getText()), tf2.getText());
		int nn = ed.modify(emp);
		System.out.println(nn+"°Ç ¼öÁ¤!");
	}

	public void handle1(ActionEvent e) throws NumberFormatException, SQLException {
		Emp emp = ed.getEmp(Integer.parseInt(tf1.getText()));
		tf1.setText(emp.employee_id+"");
		tf2.setText(emp.first_name);
	}

}




