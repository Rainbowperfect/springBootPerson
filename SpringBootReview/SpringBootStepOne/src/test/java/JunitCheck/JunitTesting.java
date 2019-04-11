package JunitCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.person.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JunitTesting.class)

public class JunitTesting{
   @Autowired
   private ApplicationContext context;

    /**
     * 测试创建的组件config能否有效
     */

    @Test
   public void testBean(){
       boolean b = context.containsBean("HelloService");
       System.out.println(b);
   }



    @Autowired
    private User user;
    @Test
    public void testUser(){
        Integer age = user.getAge();
        System.out.println(age);
    }
}
