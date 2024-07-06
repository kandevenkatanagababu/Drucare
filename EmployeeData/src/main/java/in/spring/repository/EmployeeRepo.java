package in.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.spring.entity.DepartmentData;
import in.spring.entity.EmployeeData;
@Repository
public interface EmployeeRepo  extends JpaRepository<EmployeeData, Integer>
{
}
