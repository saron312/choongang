package emp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.service.DeleteEmpService;
import emp.service.EmpNotFoundException;
import mvc.command.CommandHandler;

public class DeleteEmpHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		int empId = Integer.parseInt(req.getParameter("empid"));
		
		boolean	invalidEmpId = false;
		try {
		DeleteEmpService deleteEmpService = DeleteEmpService.getInstance();
		deleteEmpService.delete(empId);
		} catch (EmpNotFoundException e) {
			invalidEmpId = true;
		}

		String result = "";
		if(!invalidEmpId) {
			result = "사원 정보를 삭제하였습니다.";
		}else {
			result = "삭제할 사원 정보가 없습니다.";
		}
		
		req.setAttribute("result", result);
		
		return "/WEB-INF/view/delete.jsp";
	}

}
