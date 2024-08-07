package in.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.spring.entity.DepartmentData;

@Repository
public interface DepartmentRepo extends JpaRepository<DepartmentData, Integer>
{
	// public List<DepartmentRepo> findByLocation(Integer empId);

}
