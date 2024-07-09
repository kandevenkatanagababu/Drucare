package in.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="manager_info")
public class ManagerInfo
{
	@Id
	private int managerId;
	private String managerName;
	private int deptId;
	public ManagerInfo()
	{
		super();
	}
	public ManagerInfo(int managerId, String managerName, int deptId) {
		super();
		this.managerId = managerId;
		this.managerName = managerName;
		this.deptId = deptId;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
}