package spring.learning.springlearning.util;

import spring.learning.springlearning.dto.DepartmentDto;
import spring.learning.springlearning.dto.EmployeeDto;
import spring.learning.springlearning.entities.Department;
import spring.learning.springlearning.entities.Employee;

public class Converter {

    public static DepartmentDto fromDepartmentToDto(Department department) {
        return DepartmentDto.builder()
                .departmentId(department.getDepartmentId())
                .departmentName(department.getDepartmentName())
                .managerId(department.getManagerId())
                .location(department.getLocation())
                .build();
    }

    public static EmployeeDto fromEmployeeToDto(Employee employee) {
        return EmployeeDto.builder()
                .employeeId(employee.getEmployeeId())
                .email(employee.getEmail())
                .firstName(employee.getFirstName())
                .hireDate(employee.getHireDate())
                .lastName(employee.getLastName())
                .phoneNumber(employee.getPhoneNumber())
                .salary(employee.getSalary())
                .departmentId(employee.getDepartment().getDepartmentId())
                .build();
    }

    public static Employee fromDtoToEmployee(EmployeeDto employeeDto, Department departmentDto) {
        return Employee.builder()
                .employeeId(employeeDto.getEmployeeId())
                .department(departmentDto)
                .email(employeeDto.getEmail())
                .firstName(employeeDto.getFirstName())
                .lastName(employeeDto.getLastName())
                .hireDate(employeeDto.getHireDate())
                .phoneNumber(employeeDto.getPhoneNumber())
                .salary(employeeDto.getSalary())
                .build();
    }
}