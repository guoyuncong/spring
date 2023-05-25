package yc.spring.cycledependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: gyc
 * @date: 2022/07/20 9:59
 * @description:
 */
@Component
public class User1 {

    @Autowired
    private Order1 order1;


    public String sayHello() {
        System.out.println(order1.getClass());
        return "hello";
    }
}
