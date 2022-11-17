package pg888;

public class EventEx {
	public static void main(String[] args) {
		setOnAction(e->bbb(e));
		
//		setOnAction(new EventHandler() {
//
//			@Override
//			public void handle(int event) {
//				aaa();
//			}
//			private void aaa() {
//				System.out.println("aaa");
//			}
//			
//		});
	}
	
	private static void bbb(int e) {
		System.out.println("bbb");
	}

	static void setOnAction(EventHandler event) {
		event.handle(0);
	}
}
