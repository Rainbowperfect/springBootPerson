package org.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileFilter;

/**
 * 针对文件的API
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = FileAPI.class)
public class FileAPI {

    @Test
    public void firstFileAPI () {
        File file = new File("application.yml");
        String abPath = file.getAbsolutePath();
        String path =file.getPath();
        System.out.println("path:"+path);
        System.out.println("abPath:"+abPath);
    }
    @Test
    public void filterFile () {
        File file = new File("D:\\");
        System.out.println("file:"+file);
        File[] names = file.listFiles((FileFilter) new fileFiter());
        // for (File name : names) {
        //     System.out.println("name:"+name);
        // }
        for (int i = 0; i< names.length;i++) {
            System.out.println(names[i].getAbsolutePath());
        }
    }
}
