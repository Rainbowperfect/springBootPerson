package JunitCheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static java.lang.Character.LINE_SEPARATOR;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IOpractice.class)
public class IOpractice {


    /**
     * 键盘录入
     */
    @Test
    public void keyRecord () throws IOException {
        // 获取键盘的输入流
        InputStream in = System.in;
        // 将字节流转换成流
        InputStreamReader insr = new InputStreamReader(in);

        BufferedReader reader = new BufferedReader(insr);
        String line = null;
        while (((line = reader.readLine()) != null)) {

            System.out.println(line);
        }
    }

    /**
     * LINE_SPEARATOR做为一个换行字符，标记
     */
    @Test
    public void FileTest () {
        // File file = new File("de.text"+ LINE_SEPARATOR+ "22");
            String s1 = "21"+ LINE_SEPARATOR + "32";
        System.out.println(s1);
    }
}
