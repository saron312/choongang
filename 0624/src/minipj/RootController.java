package minipj;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RootController implements Initializable {
	
	@FXML private Button btnInsert;
	@FXML private Button btnUpdate;
	@FXML private Button btnDelete;
	EmpDao ed;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ed = new EmpDao();
		try {
			ed.connect();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		//������� �߰���ư
		btnInsert.setOnAction(ae -> {
			try {
				handleInsertBtn(ae);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		});
		
		
		
		//������� ������ư
		btnDelete.setOnAction(ae ->{
			try {
				handleDeleteBtn(ae);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});


	}

	public void handleInsertBtn(ActionEvent ae) throws ClassNotFoundException, SQLException {
		try {
			Stage dialog = new Stage(StageStyle.UTILITY);
			dialog.initModality(Modality.WINDOW_MODAL);
			dialog.initOwner(btnInsert.getScene().getWindow());
			dialog.setTitle("��������߰�");

			Parent insertEmp = FXMLLoader.load(getClass().getResource("insertEmp.fxml"));

			Button btnAdd = (Button) insertEmp.lookup("#btnAdd");
			btnAdd.setOnAction(e -> {
				TextField tfInEmpId = (TextField) insertEmp.lookup("#tfInEmpId");
				TextField tfInName = (TextField) insertEmp.lookup("#tfInName");
				TextField tfInHire = (TextField) insertEmp.lookup("#tfInHire");
				TextField tfInJobId = (TextField) insertEmp.lookup("#tfInJobId");
				TextField tfInEmail = (TextField) insertEmp.lookup("#tfInEmail");
				TextField tfInRes = (TextField) insertEmp.lookup("#tfInRes");
				try {
					int result = ed.insert(new Emp(Integer.parseInt(tfInEmpId.getText()), tfInName.getText(),
												   tfInHire.getText(), tfInJobId.getText(), tfInEmail.getText()));
					tfInRes.setText(result + "�� �߰��Ǿ����ϴ�.");
					// System.out.println(result);
				} catch (NumberFormatException | SQLException e1) {
					tfInRes.setText("�߸� �Է��Ԥ�");
				}
			});
			Button btnCancel = (Button) insertEmp.lookup("#btnCancel");
			btnCancel.setOnAction(e -> dialog.close());
			Scene scene = new Scene(insertEmp);
			dialog.setScene(scene);
			dialog.setResizable(false);
			dialog.show();
		} catch (IOException e) {
		}
	}
	
	public void handleDeleteBtn(ActionEvent ae) throws IOException {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(btnDelete.getScene().getWindow());
		dialog.setTitle("�����������");
		
		Parent deleteEmp = FXMLLoader.load(getClass().getResource("deleteEmp.fxml"));
		
		TextField tfSearchEmp = (TextField) deleteEmp.lookup("#tfSearchEmp");
		TextField tfSearRes = (TextField) deleteEmp.lookup("#tfSearRes");
		TextField tfSearEmpId = (TextField) deleteEmp.lookup("#tfSearEmpId");
		TextField tfSearName = (TextField) deleteEmp.lookup("#tfSearName");
		TextField tfSearHire = (TextField) deleteEmp.lookup("#tfSearHire");
		TextField tfSearJobId = (TextField) deleteEmp.lookup("#tfSearJobId");
		TextField tfSearEmail = (TextField) deleteEmp.lookup("#tfSearEmail");
		TextField tfDelRes = (TextField) deleteEmp.lookup("#tfDelRes");

		
		//�����ȣ ��ȸ -> ������� ���
		Button btnSear = (Button) deleteEmp.lookup("#btnSear");
		btnSear.setOnAction(e -> {
			try {
				Emp emp = ed.search(Integer.parseInt(tfSearchEmp.getText()));
				tfSearEmpId.setText(emp.empId+"");
				tfSearName.setText(emp.name);
				tfSearHire.setText(emp.hireDate);
				tfSearJobId.setText(emp.jobId);
				tfSearEmail.setText(emp.email);
				tfSearRes.setText("��ȸ���");
			} catch (NumberFormatException | SQLException e1) {
				tfSearEmpId.setText("");
				tfSearName.setText("");
				tfSearHire.setText("");
				tfSearJobId.setText("");
				tfSearEmail.setText("");
				tfSearRes.setText("���� ��ȣ �Դϴ�.");
			}
		});
		
		//�����������
		Button btnDel = (Button) deleteEmp.lookup("#btnDel");
		
		btnDel.setOnAction(e -> {
			try {
				int result = ed.delete(new Emp(Integer.parseInt(tfSearchEmp.getText())));
				tfDelRes.setText(result+"�� �����Ǿ����ϴ�.");
			} catch (NumberFormatException | SQLException e1) {
				e1.printStackTrace();
			}
		});
		Button btnCan = (Button) deleteEmp.lookup("#btnCan");
		btnCan.setOnAction(e -> dialog.close());
		Scene scene = new Scene(deleteEmp);
		dialog.setScene(scene);
		dialog.setResizable(false);
		dialog.show();
	}

}
