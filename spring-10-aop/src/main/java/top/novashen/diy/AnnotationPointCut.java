package top.novashen.diy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

//使用注解实现aop
@Aspect  //标注这个类是一个切面类
public class AnnotationPointCut {
    @Before("execution(* top.novashen.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("before method");
    }
}
