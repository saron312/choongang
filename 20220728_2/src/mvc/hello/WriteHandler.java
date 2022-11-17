package mvc.hello;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import guestbook.model.Message;
import guestbook.service.WriteMessageService;
import mvc.command.CommandHandler;

public class WriteHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws UnsupportedEncodingException {
		
		req.setCharacterEncoding("utf-8");
		
		
		String gname = req.getParameter("guestName");
		String gpwd = req.getParameter("password");
		String gmsg = req.getParameter("message");
		
		Message message = new Message();
		
		message.setGuestName(gname);
		message.setPassword(gpwd);
		message.setMessage(gmsg);
		
		WriteMessageService writeService = WriteMessageService.getInstance();
		writeService.write(message);		
		
		return "/WEB-INF/view/write.jsp";
	}

}
