package in.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.spring.entity.ManagerInfo;
@Repository
public interface ManagerRepo extends JpaRepository<ManagerInfo, Integer>
{
	//custom method
//	@Query(value = "select m from managers m where m.managerName like concat('%',:query,'%')")
//	public List<ManagerInfo> searchManagerId(String query);
}