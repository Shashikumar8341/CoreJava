package Vector;

public class metro_Train {

	private String empName;
	private int empId;
	private long train_number;
	private String flocation;
	private String elocation;
	private double empsalary;

	public metro_Train () {
		super();
	}
	
	public metro_Train(String empName, int empId, long train_number, String flocation, String elocation,
			double empsalary) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.train_number = train_number;
		this.flocation = flocation;
		this.elocation = elocation;
		this.empsalary = empsalary;
	}


	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return empId;
	}

	public long getTrain_number() {
		return train_number;
	}

	public String getFlocation() {
		return flocation;
	}

	public String getElocation() {
		return elocation;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	@Override
	public String toString() {
		return "metro_Train [empName=" + empName + ", empId=" + empId + ", train_number=" + train_number
				+ ", flocation=" + flocation + ", elocation=" + elocation + ", empsalary=" + empsalary + "]";
	}
	
	
	
}
