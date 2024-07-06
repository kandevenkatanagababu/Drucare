package in.spring.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.entity.DepartmentData;
import in.spring.entity.EmployeeData;
import in.spring.repository.DepartmentRepo;
@Service
public class DepartmentService 
{
	@Autowired
	DepartmentRepo repo;
	
	// add a data to a particular employee ID
	public void addData(DepartmentData data,int empId)
	{
		repo.save(data);
	}

	//update an existing Data
	public void updateData(DepartmentData data,int Id)
	{
		repo.save(data);
	}
	public Optional<DepartmentData> getData(int Id) 
	{
		return repo.findById(Id);
	}
	public void deletedata(int Id) 
	{
			repo.deleteById(Id);
	}
	//get all the data  belongs to a particular empId
	public List<DepartmentData> getAllData(int empId) 
	{
		return repo.findAll();
		
	}
	//Normal crud
	
		
		
		public List<DepartmentData> getAll()
		{
			return repo.findAll();
		}
		public void deleteData(int empId) 
		{
			repo.deleteById(empId);
			
		}
		public Optional<DepartmentData> getEmployeeById(int empId)
		{
			return repo.findById(empId);
			
		}
		public DepartmentData insert(DepartmentData data) 
		{
			return repo.save(data);
		}
		public DepartmentData update(DepartmentData data,int deptId)
		{
			return repo.save(data);
		}
}