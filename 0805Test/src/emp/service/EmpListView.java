package emp.service;

import java.util.List;

import emp.model.Emp;

public class EmpListView {
	private int empTotalCount;
	private int selectPageNum;
	private List<Emp> empList;
	private int pageEndCount;
	private int empCountPerPage;
	private int firstRow;
	private int endRow;
	
	
	public EmpListView(int empTotalCount, int selectPageNum, List<Emp> empList, int empCountPerPage, int firstRow,
			int endRow) {
		super();
		this.empTotalCount = empTotalCount;
		this.selectPageNum = selectPageNum;
		this.empList = empList;
		this.empCountPerPage = empCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		
		calculPageCount();
	}
	
	private void calculPageCount() {
		if(empTotalCount == 0) {
			pageEndCount = 0;
		}else {
			pageEndCount = empTotalCount/empCountPerPage;
			if(empTotalCount%empCountPerPage > 0) {
				pageEndCount++;
			}
		}
	}
	
	public int getEmpTotalCount() {
		return empTotalCount;
	}
	public int getSelectPageNum() {
		return selectPageNum;
	}
	public List<Emp> getEmpList() {
		return empList;
	}
	public int getPageEndCount() {
		return pageEndCount;
	}
	public int getEmpCountPerPage() {
		return empCountPerPage;
	}
	public int getFirstRow() {
		return firstRow;
	}
	public int getEndRow() {
		return endRow;
	}
	
	public boolean isEmpty() {
		return  empTotalCount == 0;
	}
}
