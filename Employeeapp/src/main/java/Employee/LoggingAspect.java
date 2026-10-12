package Employee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* Employee.EmployeeService.addEmployee(..))")
    public void logBeforeAdd() {
        System.out.println("Logging: Adding employee");
    }

    @Before("execution(* Employee.EmployeeService.displayEmployee(..))")
    public void logBeforeDisplay() {
        System.out.println("Logging: Displaying employee");
    }

    @Before("execution(* Employee.EmployeeService.calculateSalary(..))")
    public void logBeforeSalary() {
        System.out.println("Logging: Calculating salary");
    }
}