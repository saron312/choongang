package interf2;

public interface Aaa {
	int MIN = 100;
	int MAX = 5000;

	void aaa();

	static void hhh() {

	}

	default void ddd(String ss) {
//		this.MIN = 50;
//		this.MIN = 50;
		System.out.println("이것은" + ss + "입니다.");
	}
}
