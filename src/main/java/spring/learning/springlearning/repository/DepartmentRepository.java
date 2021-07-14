package spring.learning.springlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.learning.springlearning.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}