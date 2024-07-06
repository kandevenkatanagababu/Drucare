package in.spring.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.entity.DepartmentData;
import in.spring.entity.EmployeeData;
import in.spring.service.DepartmentService;
@RestController
public class DepartmentController 
{
	@Autowired
	DepartmentService service;
	//restApi for mapping
	@DeleteMapping("/employees/department/{deptId}")
	public void deleteData(@PathVariable int deptId) 
	{
		service.deletedata(deptId);
	}
	
	@PutMapping("employees/{empId}/department/{deptId}")
	public void updateData(@RequestBody DepartmentData data,@PathVariable int deptId )
	{
		service.updateData(data,deptId);
	}
	@PostMapping("/employees/{empId}/data")
	public void addData(@RequestBody DepartmentData data,@PathVariable int empId) 
	{
		data.setData(new EmployeeData(empId,"",0.0,0));
		service.addData(data,empId);
	}
	@GetMapping("/employees/{empId}/departmentData/{deptId}")
	public Optional<DepartmentData> getData(@PathVariable int deptId) 
	{
		return service.getData(deptId);
	}
	@GetMapping("/employees/{empId}/departmentData")
	public  List<DepartmentData> getAllData(@PathVariable int empId) 
	{
		return service.getAllData(empId);
	}
	
	       //Normal crud operations
			@GetMapping("/department/all")
			public List<DepartmentData>getAllData(){
				return service.getAll();
			}
			@GetMapping("/department/{empId}")
			public Optional<DepartmentData> employeeById(@PathVariable int empId)
			{
				return service.getEmployeeById(empId);
			}
			
			@PostMapping("/department/add")
			public DepartmentData insertData(@RequestBody DepartmentData data) 
			{
			return service.insert(data);
			}
			@DeleteMapping("/delete/{deptId}")
			public void delete(@PathVariable int deptId)
			{
				service.deleteData(deptId);
			}
			@PutMapping("/department/{deptId}")
			public DepartmentData update(@RequestBody DepartmentData data,@PathVariable int deptId)
			{
				return service.update(data, deptId);
			}
}

