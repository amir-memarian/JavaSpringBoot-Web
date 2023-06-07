package project.employeeAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class EmployeeServiceAspect {
    @Before(value = "execution(* project.employeeAOP.service.EmployeeService.createEmployee(..)) && args(empId, firstName, secondName)")
    public void beforeAdvice(JoinPoint joinPoint, String empId, String firstName, String secondName) {
        System.out.println("Before method:" + Arrays.stream(joinPoint.getArgs()).toList());
        System.out.println("Creating Employee with first name - "
                + firstName + ", second name - "
                + secondName + " and id - "
                + empId);
    }
    @After(value = "execution(* project.employeeAOP.service.EmployeeService.*(..)) && args(empId)")
    public void afterAdvice(JoinPoint joinPoint, String empId) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Delete EmployeeId  with Id - "
                + empId);
    }
}
