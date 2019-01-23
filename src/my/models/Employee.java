package my.models;

// Model or POJO or Bean
public class Employee {
	Integer empId;
	String empName, empEmail, empPhoneNo;
	Double empSal;

	Employee() {}

	public Employee(Integer empId, String empName, String empEmail, String empPhoneNo, Double empSal) {
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empPhoneNo = empPhoneNo;
		this.empSal = empSal;
	}

	public Integer getEmpId() { return empId; }

	public void setEmpId(Integer empId) { this.empId = empId; }

	public String getEmpName() { return empName; }

	public void setEmpName(String empName) { this.empName = empName; }

	public String getEmpEmail() { return empEmail; }

	public void setEmpEmail(String empEmail) { this.empEmail = empEmail; }

	public String getEmpPhoneNo() { return empPhoneNo; }

	public void setEmpPhoneNo(String empPhoneNo) { this.empPhoneNo = empPhoneNo; }

	public Double getEmpSal() { return empSal; }

	public void setEmpSal(Double empSal) { this.empSal = empSal; }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPhoneNo=" + empPhoneNo + ", empSal=" + empSal + "]";
	}

}
