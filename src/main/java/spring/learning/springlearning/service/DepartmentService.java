package spring.learning.springlearning.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.learning.springlearning.dto.DepartmentDto;
import spring.learning.springlearning.entities.Department;
import spring.learning.springlearning.repository.DepartmentRepository;
import spring.learning.springlearning.util.Converter;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DepartmentService {

    private final DepartmentRepository departmentRepository;

    public List<DepartmentDto> getAllDepartments() {
        return departmentRepository.findAll().stream()
                .map(Converter::fromDepartmentToDto)
                .collect(Collectors.toList());
    }

    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }

    public DepartmentDto getDepartmentById(Integer id) {
        return Converter.fromDepartmentToDto(departmentRepository.getById(id));
    }
}