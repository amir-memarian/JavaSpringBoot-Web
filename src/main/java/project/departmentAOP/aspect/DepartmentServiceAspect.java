package project.departmentAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class DepartmentServiceAspect {
    @Before(value = "execution(* project.departmentAOP.service.DepartmentService.createDepartment(..)) && args(departmentId, departmentName)")
    public void beforeAdvice(JoinPoint joinPoint,String departmentId,String departmentName){
        System.out.println("Before method:" + Arrays.stream(joinPoint.getArgs()).toList());
        System.out.println("Creating Department with department name - "
                + departmentName + ", and id - "
                + departmentId);
    }
    @After(value = "execution(* project.departmentAOP.service.DepartmentService.*(..)) && args(departmentId)")
    public void afterAdvice(JoinPoint joinPoint, String departmentId) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Delete Department  with Id - "
                + departmentId);
    }
}
