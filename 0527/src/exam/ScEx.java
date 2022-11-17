package exam;

public class ScEx {
	public static void main(String[] args) {
		Sc a = new Sc();
		a.input();
		int sum = a.add();
		double avg = a.avg();
		System.out.println("ÃÑÁ¡ : "+sum);
		System.out.println("Æò±Õ : "+avg);
		
		if(avg>=60) {
			System.out.println("ÇÕ°Ý");
		}else {
			System.out.println("ºÒÇÕ°Ý");
		}
	}

}
