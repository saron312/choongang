import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		System.out.println("����");
		for(int i=0; i<300;i++) {
			System.out.println("*****");
		}
		Thread th = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(100); //1000�� 1��
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Calendar cal = Calendar.getInstance();
				System.out.println("��");
			}
		});
		th.start();
	}
}
