package org.person;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author RootAdmin/zero
 * @version v1.0
 * @create 2019/11/6/22:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JunitTesting.class)

public class StringAPI {

    @Test
    public void s1Test () {
        String s1 = "abdfsdfsdafdsfsdf";
        int i = s1.indexOf("sd");
        byte[] bytes = s1.getBytes();
        for (int i1 = 0; i1 < bytes.length; i1++) {
            System.out.println("il数组:"+bytes[i1]);
        }
        System.out.println("第"+i+"数字为："+i);
        String  s2 = "ca";
        String s4 = "cd";
        System.out.println("对比"+s2.compareTo(s4));
    }

    @Test
    public void countTest () {
        String s1 = "nbafdfdfdnbafdsffdsjnba";
        String[] nbas = s1.split("nba");
        System.out.println("长度："+nbas.length);
    }

    /**
     * StringBuffer是用于储存的字符串的缓冲区，其特点是：
     * 1.长度是可以变的 2.可以储存不同的数据
     */
    @Test
    public void tetStringBuffer () {
        StringBuffer sb = new StringBuffer();
        StringBuffer append = sb.append(5).append("45");
        String s = append.toString();
        System.out.println(s);
        StringBuffer ds = append.insert(2, "得瑟得瑟");
        System.out.println(ds);

    }
    @Test
    public void testStringIfEmpty () {
        String s = StringUtils.defaultIfEmpty("7878", "36466");
        System.out.println("打印数据"+s);
        int i = Integer.parseInt(s);
        System.out.println("解析后的字符串"+i);
    }
}
