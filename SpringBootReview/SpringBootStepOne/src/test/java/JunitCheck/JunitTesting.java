package JunitCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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



    // @Autowired
    // private User user;
    // @Test
    // public void testUser(){
    //     Integer age = user.getAge();
    //     System.out.println(age);
    // }

    /**
     * 日志的级别。springboot默认的为info
     * trace->debugger->info->warn->error
     */
    @Test
    public void testLoggLerver(){

        Logger logger = LoggerFactory.getLogger(JunitTesting.class);
        logger.trace("it's trace");
        logger.debug("it's debugger");
        logger.warn("it's warn");
        logger.error("it's error");

    }
}
