package abstr;

public class Dog extends Animal{
	public Dog() {
		this.kind = "������";
	}

	@Override
	public void sound() { //�߻�޼ҵ� ������
		System.out.println("�۸�");
	}
	
}
