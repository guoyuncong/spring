package yc.spring.cycledependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: gyc
 * @date: 2022/07/20 9:59
 * @description:
 */
@Component
public class Order1 {

    @Autowired
    private User1 user1;

    @Transactional(rollbackFor = Exception.class)
    public String sayHello() {
        System.out.println(user1.getClass());
        return user1.sayHello();
    }
}
