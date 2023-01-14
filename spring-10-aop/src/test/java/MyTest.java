import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.novashen.service.Userservice;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        动态代理的是接口不是实现类，所以这里的类类型要注意
        Userservice userService = (Userservice) context.getBean("userService");

        userService.add();

    }
}
