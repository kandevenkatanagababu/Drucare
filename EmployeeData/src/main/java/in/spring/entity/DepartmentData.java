package in.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="department_data")
public class DepartmentData
{
	@Id
	private int deptId;
	private int deptNo;
	private String location;
	private int managerId;
	
	@ManyToOne
	private EmployeeData data;
	

	public DepartmentData() {
		super();
	}


	public DepartmentData(int deptId, int deptNo, String location, int managerId,  int empId) {
		super();
		this.deptId = deptId;
		this.deptNo = deptNo;
		this.location = location;
		this.managerId = managerId;
		this.data=new EmployeeData(empId,"",0.0,0);
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public int getDeptNo() {
		return deptNo;
	}


	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getManagerId() {
		return managerId;
	}


	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}


	public EmployeeData getData() {
		return data;
	}


	public void setData(EmployeeData data) {
		this.data = data;
	}
	
}