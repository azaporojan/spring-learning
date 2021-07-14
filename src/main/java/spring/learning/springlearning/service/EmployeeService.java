package spring.learning.springlearning.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.learning.springlearning.dto.EmployeeDto;
import spring.learning.springlearning.repository.DepartmentRepository;
import spring.learning.springlearning.repository.EmployeeRepository;
import spring.learning.springlearning.util.Converter;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public List<EmployeeDto> getEmployeeList() {
        return employeeRepository.findAll().stream()
                .map(Converter::fromEmployeeToDto)
                .collect(Collectors.toList());
    }

    public void saveEmployee(EmployeeDto employeeDto) {
        employeeRepository.save(Converter.fromDtoToEmployee(employeeDto, departmentRepository.getById(employeeDto.getDepartmentId())));
    }
}