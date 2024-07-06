package in.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import in.spring.entity.EmployeeData;
import in.spring.entity.ManagerInfo;
import in.spring.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class EmployeeController 
{
	@Autowired
	RestTemplate template;
		@Autowired
		private EmployeeService service;
		@Tag(name = "get",description="get methods for employee API")
		@GetMapping("/employees")
		public List<EmployeeData> getAllEmployees()
		{
			return service.getEmployees();
			
		}
		@Tag(name = "get",description="get methods for employee API")
		@GetMapping("/employees/{empId}")
		public Optional<EmployeeData> getOneEmployee(@PathVariable int empId)
		{
			return service.getEmployee(empId);
		}
		@DeleteMapping("employees/{empId}")
		public void deleteEmployee(@PathVariable int empId)
		{
			service.deleteEmployee(empId);
		}
		@PutMapping("/employees/{empId}")
		public EmployeeData update(@RequestBody EmployeeData update)
		{
			return service.updateEmployee(update);
		}
		@Operation(summary="updaing an employee",
				description="Updating an existing data. The employeeSwagger will update")
		@PostMapping("/employees")
		public EmployeeData insertEmployee(@RequestBody EmployeeData entity)
		{
			return service.addEmployee(entity);
		}
		@GetMapping("/employee/page")
		public Page<EmployeeData> getEmployeepage(@RequestParam("pageNo")Optional<Integer> pageNo,
				@RequestParam("sort") Optional<String> sortBy)
		{
			return service.getEmployeePage(pageNo, sortBy);
		}
		@GetMapping("/managerInfo")
		public Object getManagerinfo()
		{
			String url="http:////ManagerData/all";
			try {
				return template.getForObject(url, ManagerInfo.class);
			}
			catch(RestClientException e)
			{
				e.printStackTrace();
			}
			return url;
	
		}
		
		
	
	}
