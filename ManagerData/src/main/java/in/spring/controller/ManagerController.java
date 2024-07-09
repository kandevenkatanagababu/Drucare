package in.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spring.entity.ManagerInfo;
import in.spring.service.ManagerServiceImplementation;
@RestController
@RequestMapping("/manager/details")
public class ManagerController 
{
	@Autowired
	 private ManagerServiceImplementation service;
	//restAPI's
	  @GetMapping("/all")
	  public List<ManagerInfo> getAllManagerInfo() 
	  {
	        return service.getAllManagerInfo();
	  }

	  @GetMapping("/{managerId}")
	  public Optional<ManagerInfo> getManagerById(@PathVariable int managerId)
	  {
	         return service.getManagerById(managerId);
	  }
	  @PostMapping("/add")
	  public ManagerInfo insertManagerInfo(@RequestBody ManagerInfo info)
	  {
	        return service.insertManagerInfo(info);
	  }
	  @DeleteMapping("/delete/{managerId}")
	  public void deleteManagerInfo(@PathVariable int managerId ) 
	  {
	        service.deleteManagerInfo(managerId);
	  }
	  @PutMapping("/update/{managerId}")
	  public ManagerInfo updateManagerData(@RequestBody ManagerInfo info,@PathVariable int managerId)
	  {
		  return service.updateManagerInfo(info,managerId);
	  }
//	  @GetMapping("/search")
//	  public List<ManagerInfo> searchManagerId(@RequestParam("query") String query)
//	  {
//		  return service.searchManagerId(query);
//	  }
}
