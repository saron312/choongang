
public class Car1 {
	//�ʵ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	//������
	Car1(){
	} //������1
	Car1(String model){
		this.model = model;
	} //������2
	Car1(String model, String color){
		//this.model = model;
		this(model); 
		this.color= color;
	} //������3
	Car1(String model, String color, int maxSpeed){
		//this.model = model;
		//this.color= color;
		this(model,color);
		this.maxSpeed = maxSpeed;
	} //������4

}
