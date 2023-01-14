package top.novashen.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    //method 要执行的方法
    //objects==args 传递参数
    //o==target 执行的对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("log " + method.getName());
    }

}
