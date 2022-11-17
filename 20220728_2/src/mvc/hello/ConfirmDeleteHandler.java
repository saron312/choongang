package mvc.hello;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.Message;
import guestbook.service.DeleteMessageService;
import mvc.command.CommandHandler;

public class ConfirmDeleteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		
		int messageId = Integer.parseInt(req.getParameter("messageId"));
		
		Message message = new Message();
		message.setId(messageId);
		return "/WEB-INF/view/confirmDel.jsp";
	}

}
