package emp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.service.EmpListView;
import emp.service.ListEmpService;
import mvc.command.CommandHandler;

public class ListHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		req.setCharacterEncoding("utf-8");
		
		String pageNumStr = req.getParameter("page");
		int pageNum = 1;
		if(pageNumStr != null) {
			pageNum = Integer.parseInt(pageNumStr);
		}
		
		ListEmpService listEmpService = ListEmpService.getInstance();
		EmpListView view = listEmpService.selectEmpList(pageNum);
		
		req.setAttribute("view", view);
		return "/WEB-INF/view/list.jsp";
	}

}
