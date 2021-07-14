package spring.learning.springlearning.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import spring.learning.springlearning.dto.DepartmentDto;
import spring.learning.springlearning.entities.Department;
import spring.learning.springlearning.service.DepartmentService;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class DepartmentController {

    private final DepartmentService departmentService;

    @GetMapping("/departments")
    public List<DepartmentDto> getDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/departments")
    public void saveDepartment(@RequestBody Department department) {
        departmentService.saveDepartment(department);
    }

    @GetMapping("/departments/{id}")
    public DepartmentDto getDepartmentById(@PathVariable Integer id) {
        return departmentService.getDepartmentById(id);
    }
}