package project.departmentAOP.service;

import project.departmentAOP.model.Department;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    public Department createDepartment(String depId, String depName)
    {
        Department dept = new Department();
        dept.setDepartmentID(depId);
        dept.setDepartmentName(depName);
        return dept;
    }
    public void deleteDepartment(String depId)
    {
    }
}
