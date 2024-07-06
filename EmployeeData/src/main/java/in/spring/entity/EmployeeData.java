package in.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="employee_data")
public class EmployeeData 
{
	@Id
	private int empId;
	private String empName;
	private double empSalary;
	private int deptId;
	public EmployeeData() {
		super();
	}
	public EmployeeData(int empId, String empName, double empSalary, int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.deptId = deptId;
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
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
}