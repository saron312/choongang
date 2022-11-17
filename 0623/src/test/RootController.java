package test;


import java.net.URL;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class RootController implements Initializable{
	@FXML private Button btn;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private TextField inputempId;
	@FXML private TextField result;
	@FXML private TextField tfempId;
	@FXML private TextField tfempname;
	@FXML private TextField tfsalary;
	@FXML private TextField inputSalary;
	@FXML private TextArea empList; 
	@FXML private TextField modiResult;
	EmpDao ed;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ed = new EmpDao();
		try {
			ed.connect();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		btn.setOnAction(e->{
			try {
				handle1(e);
			} catch (NumberFormatException | SQLException e1) {
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
//		btn3.setOnAction(e->{
//			try {
//				handle3(e);
//			} catch (ClassNotFoundException | SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		});
	
	}
	
	public void handle1(ActionEvent e) throws NumberFormatException, SQLException {
		Emp emp = ed.printName(Integer.parseInt(inputempId.getText()));
		inputempId.setText(emp.empId+"");
		result.setText("<<검색 결과>>");
		tfempId.setText(emp.empId+"");
		tfempname.setText(emp.name);
		tfsalary.setText(emp.salary+"");
	}

	public void handle2(ActionEvent e) throws SQLException {
		Emp emp = new Emp(Integer.parseInt(inputempId.getText()),Integer.parseInt(inputSalary.getText()));
		inputSalary.setText(emp.salary+"");
		int re = ed.modify(emp);
		modiResult.setText(re+"건 수정되었습니다.");
//		System.out.println(re+"건 수정되었습니다.");
	}
	
//	public void handle3(ActionEvent e) throws ClassNotFoundException, SQLException {
//		List<String> aaa = new ArrayList<String>();
////		for(Emp emp:ed.lists()) {
////			aaa.add(emp.print());
////		}
////		for(int i=0;i<aaa.size();i++) {
////			empList.getText(i,aaa);
////		}
////		Emp ss= null;
//		for(int i=0;i<ed.lists().size();i++) {
//			String ss = ed.lists().get(i);
//			System.out.println(ss);
//		}
//	}
	
	
}
