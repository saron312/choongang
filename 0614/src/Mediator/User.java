package Mediator;

public class User {
	private String name;
	
	User(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sendMsg(String msg) {
		ChatRoom.showMsg(this,msg);
	}
	
}
