package exExtends07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation=nation;
		System.out.println("parent(String nation) call");
	}
}
