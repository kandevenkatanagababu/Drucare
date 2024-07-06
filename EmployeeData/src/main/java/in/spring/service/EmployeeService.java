package in.spring.service;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;


import in.spring.entity.EmployeeData;
import in.spring.repository.EmployeeRepo;
@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepo repo;
	
	//GetAllEmployees
	public List<EmployeeData> getEmployees()
	{
		return repo.findAll();
	}
	//GetOneEmployee
	public Optional<EmployeeData> getEmployee(int empId)
	{
		return repo.findById(empId);
	}
	//DeleteEmployee
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}
	//updateEmployee
	public EmployeeData updateEmployee(EmployeeData data)
	{
		return repo.save(data);
	}
	//InsertEmployee
	public EmployeeData addEmployee(EmployeeData entity)
	{
		return repo.save(entity);
	}
	//pagination
	public Page<EmployeeData> getEmployeePage(Optional<Integer> pageNo,Optional<String> sortColumn) 
	{
		// TODO Auto-generated method stub
		return repo.findAll(PageRequest.of
				(pageNo.orElse(0),  //page number
						2,//3 record per page
						Direction.DESC,
						sortColumn.orElse("empId") // sort by column
						));

	}
	

	
}

