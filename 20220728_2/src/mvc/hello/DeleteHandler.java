package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.service.DeleteMessageService;
import guestbook.service.GetMessageListService;
import guestbook.service.InvalidPassowrdException;
import guestbook.service.MessageListView;
import mvc.command.CommandHandler;

public class DeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) {
		
		int messageId = Integer.parseInt(req.getParameter("messageId"));
		String password = req.getParameter("password");
		boolean invalidPassowrd = false;
		try {
			DeleteMessageService deleteService = 
					DeleteMessageService.getInstance();
			deleteService.deleteMessage(messageId, password);
		} catch(InvalidPassowrdException ex) {
			invalidPassowrd = true;
		}
		
		String result = "";
		if (!invalidPassowrd) {
			result = "�޽����� �����Ͽ����ϴ�.";
		} else {
			result = "�Է��� ��ȣ�� �ùٸ��� �ʽ��ϴ�. ��ȣ�� Ȯ�����ּ���.";
		}
		
		req.setAttribute("delete", result);
		return "/WEB-INF/view/delete.jsp";
	}

}
