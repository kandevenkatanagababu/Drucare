package in.spring.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.entity.ManagerInfo;
import in.spring.repository.ManagerRepo;
@Service
public class ManagerServiceImplementation implements ManagerServiceInterface
{
	@Autowired
	ManagerRepo repo;
	//getAll
	public List<ManagerInfo> getAllManagerInfo() 
	{
	    return repo.findAll().stream().collect(Collectors.toList());
	}

		//getOneData
	    public Optional<ManagerInfo> getManagerById(int managerId)
	    {
	        return repo.findById(managerId).stream().findFirst();
	    }
	    //insert
	    public ManagerInfo insertManagerInfo(ManagerInfo info) 
	    {
	        return repo.save(info);
	    }
	    //update
	    public ManagerInfo updateManagerInfo(ManagerInfo info,int managerId) 
	    {
	        return repo.save(info);
	    }
	    //delete
	    public void deleteManagerInfo(int managerId) 
	    {
	        repo.deleteById(managerId);
	    }
	    //custom method for search managerId
//		public List<ManagerInfo> searchManagerId(String query) {
//			// TODO Auto-generated method stub
//			return repo.searchManagerId(query);
//		}
	}