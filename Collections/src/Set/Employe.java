package Set;

import java.util.Objects;

public class Employe implements  Comparable<Employe>{
	private int empId;

	private String empName;

	private double empsalary;

	/**
	 * @param empId
	 * @param empName
	 * @param empsalary
	 */
	public Employe(int empId, String empName, double empsalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empsalary = empsalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpsalary() {
		return empsalary;
	}

	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empsalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return empId == other.empId && Objects.equals(empName, other.empName) && empsalary == other.empsalary;
	}

	public Employe() {
		super();
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empsalary=" + empsalary + "]";
	}

	@Override
	public int compareTo(Employe o) {
		return this.empName.compareTo(o.empName);
	}

}
