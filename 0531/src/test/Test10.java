package test;

public class Test10 {
	public static void main(String[] args) {
		double sc = 88.45;
		//int sc = (int) (Math.random() * 20) + 61;
		String ss = "";

		if (sc > 100 || sc < 0) {
			System.out.println("�Է¿���");
		} else {
			switch ((int)sc/10) {
			case 9:
				ss = "��";
				break;
			case 8:
				ss = "��";
				break;
			case 7:
				ss = "��";
				break;
			case 6:
				ss = "��";
				break;
			case 5:
				ss = "��";
				break;
			default:
			}

			// if (sc >= 90) {
			// ss = "��";
			// } else if (sc >= 80) {
			// ss = "��";
			// } else if (sc >= 70) {
			// ss = "��";
			// } else if (sc >= 60) {
			// ss = "��";
			// } else if (sc >= 50) {
			// ss = "��";
			// }
		}
		System.out.println(sc + "�� - " + ss);
		

	}

}
