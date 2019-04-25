package JunitCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeReTest.class)
public class EmployeeReTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void employeeQuery() {

        String forObject = restTemplate.getForObject("/", String.class);
        assert(forObject).equals("Hello word");
    }

}
