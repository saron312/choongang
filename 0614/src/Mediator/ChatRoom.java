package Mediator;

import java.util.Date;

public class ChatRoom {
	public static void showMsg(User us, String msg) {
		System.out.println
		(new Date().toString()+"["+us.getName()+"]"+msg);
	}
}
