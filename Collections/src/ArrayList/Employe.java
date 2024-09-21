package ArrayList;

public class Employe {
	
	private int empId;
	
	private String empName;
	
	private int empsalary;

	/**
	 * 
	 */
	public Employe() {
		super();
	}
	
	

	/**
	 * @param empId
	 * @param empName
	 * @param empsalary
	 */
	public Employe(Integer empId, String empName, Integer empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}



	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(Integer empsalary) {
		this.empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}
	
	

}
