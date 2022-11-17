package common;

public class TestEx1 {

	public static void main(String[] args) {
		MyBatisService ms = new MyBatisService();
		
		Emp emp = new Emp();
		emp.employee_id = 2;
		emp.name = "ddd";
		emp.salary= 200;
		int nn = ms.insertEx(emp);
		System.out.println(nn);
		
//		String dd=ms.selectName(200);
//		System.out.println(dd);
//		int n = ms.insertEx0621();
//		System.out.println(n+"°Ç ÀÔ·Â!");
		
		
	}

}
