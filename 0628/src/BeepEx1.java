import java.awt.Toolkit;

public class BeepEx1 {
	public static void main(String[] args) throws InterruptedException {
		Thread th = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 0; i < 5; i++) {
				tk.beep();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("beep!!");
			}
		});

		// // Runnable bt = new BeepTask();
		// Thread th = new Thread(new Runnable() {
		// @Override
		// public void run() {
		// Toolkit tk = Toolkit.getDefaultToolkit();
		// for (int i = 0; i < 5; i++) {
		// tk.beep();
		// try {
		// Thread.sleep(500);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// }
		// System.out.println("beep!!");
		// }
		// }
		// });
		// th.start();
		// Toolkit tk = Toolkit.getDefaultToolkit();
		// for (int i = 0; i < 5; i++) {
		// tk.beep();
		// Thread.sleep(500);
		// System.out.println("beep!");
		// }

		// for(int i=0; i<5; i++) {
		// tk.beep();
		// Thread.sleep(500);
		// System.out.println("beep!!");
		// }
	}
}
