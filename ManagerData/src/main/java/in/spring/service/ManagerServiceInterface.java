package in.spring.service;

import java.util.List;
import java.util.Optional;


import in.spring.entity.ManagerInfo;

public interface ManagerServiceInterface 
{
	//Jpa inbulid methods
	public List<ManagerInfo> getAllManagerInfo();
	public Optional<ManagerInfo> getManagerById(int managerId);
	public ManagerInfo insertManagerInfo(ManagerInfo info);
	public ManagerInfo updateManagerInfo(ManagerInfo info,int managerId);
	public void deleteManagerInfo(int managerId);
	 
	 

}
