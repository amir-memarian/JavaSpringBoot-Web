package project.accountAOP.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AccountAspect {
    @Pointcut(value= "execution(* project.accountAOP.service.AccountService.*(..))")
    private void logDisplayingBalance()
    {
    }
    //Declares the around advice that is applied before and after the method matching with a pointcut expression
    @Around(value= "logDisplayingBalance()")
    public void aroundAdvice(ProceedingJoinPoint jp) throws Throwable
    {
        System.out.println("The method aroundAdvice() before invocation of the method " + jp.getSignature().getName() + " method");
        try
        {
            jp.proceed();
        }
        finally
        {

        }
        System.out.println("The method aroundAdvice() after invocation of the method " + jp.getSignature().getName() + " method");
    }
}
