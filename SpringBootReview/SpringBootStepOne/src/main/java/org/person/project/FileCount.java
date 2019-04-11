package org.person.project;

import java.io.*;

public class FileCount {

    public static void ReadSubdirectory(File myDir) {
        // 判断myDir是否为文件目录
        if (myDir.isDirectory()) {
            File[] subFile = myDir.listFiles();
            for (int i = 0; i < subFile.length; i++) {
                // 如果列表下含有子目录
                if (subFile[i].isDirectory()) {
                    ReadSubdirectory(subFile[i]);
                } else {
                    ReadSubFile(subFile[i]);
                }
            }
        }
    }

    // 统计当前文件中数字 字母 空格的个数 和 文件行数
    public static void ReadSubFile(File file) {
        int numCount = 0;// 数字个数
        int letterCount = 0;// 字母个数
        int spaceCount = 0;// 空格个数
        int lineCount = 0;//行数
        int uniChar = 0;
        try {
            FileInputStream input = new FileInputStream(file);
            while ((uniChar = input.read()) != -1) {
                if (uniChar >= 48 && uniChar <= 57) {
                    numCount++;
                } else if ((uniChar >= 65 && uniChar <= 90) || (uniChar >= 97 && uniChar <= 122)) {
                    letterCount++;
                } else if (uniChar == 32) {
                    spaceCount++;
                }
            }
            BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while(buffer.readLine() != null) {
                lineCount++;
            }
            System.out.println(file.getAbsolutePath());
            System.out.println(" 数字个数 : " + numCount);
            System.out.println(" 字母个数 : " + letterCount);
            System.out.println(" 空格个数 : " + spaceCount);
            System.out.println(" 行数数 : " + lineCount);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ReadSubdirectory(new File("D://src"));
    }
}
