package emp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.model.Emp;
import emp.service.SelectEmpService;
import mvc.command.CommandHandler;

public class EmpInfoHandler implements CommandHandler{

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int empId = Integer.parseInt(req.getParameter("empId"));
		
		SelectEmpService selectEmpService = SelectEmpService.getInstance();
		Emp emp = selectEmpService.select(empId);
		
		req.setAttribute("emp", emp);
		
		return "/WEB-INF/view/empInfo.jsp";
	}

}
