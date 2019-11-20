package JunitCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeReTest.class)
public class EmployeeReTest {

    @Test
    public void employeeQuery() {
        //LocalDateTime time = LocalDateTime.now();
        Date time = new Date();
        SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = formater.format(time);
        System.out.println(format1);
        String[] split = format1.replace(":", "").replace("-", "").split(" ");
        for (int i = 0; i < split.length; i++) {
            System.out.println("变化后的值"+split[1]);
        }
    }
}
