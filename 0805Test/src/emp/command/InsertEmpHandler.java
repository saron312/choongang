package emp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.model.Emp;
import emp.service.InsertEmpService;
import mvc.command.CommandHandler;

public class InsertEmpHandler implements CommandHandler{
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		req.setCharacterEncoding("utf-8");
		
		String empName = req.getParameter("empName");
		String empAdd = req.getParameter("empAdd");
		String empTel = req.getParameter("empTel");
		String empImg = req.getParameter("empImg");
		String empFile = req.getParameter("empFile");
		
		Emp emp = new Emp();
		
		emp.setEmpName(empName);
		emp.setEmpAdd(empAdd);
		emp.setEmpTel(empTel);
		emp.setEmpImg(empImg);
		emp.setEmpFile(empFile);
		
		InsertEmpService insertEmpService = InsertEmpService.getInstance();
		insertEmpService.insert(emp);
		
		return "/WEB-INF/view/insertSuccess.jsp";
	}
}
