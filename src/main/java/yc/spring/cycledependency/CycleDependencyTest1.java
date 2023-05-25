package yc.spring.cycledependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: gyc
 * @date: 2022/07/05 15:55
 * @description:
 */
public class CycleDependencyTest1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springmvc.xml");
        User1 user1  = (User1) context.getBean("user1");
        Order1 order1 = (Order1) context.getBean("order1");
    }
}
