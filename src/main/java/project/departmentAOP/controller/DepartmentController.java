package project.departmentAOP.controller;

import project.departmentAOP.model.Department;
import project.departmentAOP.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/add/department",method = RequestMethod.GET)
    public Department addDepartment(@RequestParam("depId") String depId,
                                    @RequestParam("depName") String depName){
        return departmentService.createDepartment(depId,depName);
    }

    @RequestMapping(value="/remove/department",method = RequestMethod.GET)
    public String removeDepartment(@RequestParam("depId") String depId){
        departmentService.deleteDepartment(depId);
        return "Department removed";
    }

}
