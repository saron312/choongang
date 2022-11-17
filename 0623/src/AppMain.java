import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	
	public AppMain() {
		System.out.println(Thread.currentThread().getName()+" : ������");
	}
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+" : ����");
		launch(args);
	}

	@Override
	public void init() throws Exception {
		System.out.println(Thread.currentThread().getName()+" : init");
	}
	
	@Override
	public void stop() throws Exception {
		System.out.println(Thread.currentThread().getName()+": stop");
	}
	
	@Override
	public void start(Stage ps) throws Exception {
		System.out.println(Thread.currentThread().getName()+" start");
		ps.show();
	}
	


	
	
}
