package threadTest;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RootController implements Initializable {
	@FXML private TextField tf1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		handle1();
	}

	
	public void handle1() {
		Thread th = new Thread(() -> {
			SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
			while (true) {
				String strTime = sdf.format(new Date());
				tf1.setText(strTime);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th.start();
	}
	
	

}
