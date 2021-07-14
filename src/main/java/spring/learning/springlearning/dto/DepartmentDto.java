package spring.learning.springlearning.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class DepartmentDto {
    private Integer departmentId;
    private String departmentName;
    private Integer managerId;
    private String location;
}