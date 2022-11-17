

public class Test01 {

	public static void main(String[] args) {
		String[] animals = {"사자","곰","토끼","호랑이"};
		//for(타입 이름:배열의 이름){}
		for(String ani:animals) {
			System.out.println(ani);
		}
		
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
		}
		System.out.println(animals); //메모리 주소값이 나옴
	}

}
