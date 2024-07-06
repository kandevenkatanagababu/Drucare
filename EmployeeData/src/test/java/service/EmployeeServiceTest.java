package service;

import static org.mockito.Mockito.when;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.mock.mockito.MockBean;

import in.spring.repository.EmployeeRepo;
import in.spring.service.EmployeeService;

@SpringBootApplication
public class EmployeeServiceTest 
{
	@Autowired
	EmployeeService service;
	@MockBean
	EmployeeRepo repo;
	
//	public void getEmployee()
//	{
//		when(service.getEmployee(1)).thenReturn(null));
//	}
//	private EmployeeData 
}
