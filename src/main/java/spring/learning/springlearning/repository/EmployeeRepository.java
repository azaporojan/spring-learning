package spring.learning.springlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.learning.springlearning.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
