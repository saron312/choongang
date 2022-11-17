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
			result = "메시지를 삭제하였습니다.";
		} else {
			result = "입력한 암호가 올바르지 않습니다. 암호를 확인해주세요.";
		}
		
		req.setAttribute("delete", result);
		return "/WEB-INF/view/delete.jsp";
	}

}
