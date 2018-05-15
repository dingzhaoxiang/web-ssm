package com.dzx.ssm.utils;
import java.io.*;
/**
 * @Author:DingZhaoxiang
 * @Description:读取文件内容，返回字符串
 * @Date 14:16  2018/4/12
 **/
public class FileReadUtil {
    public static void main(String[] args) {
        System.out.println(readFile("d:\\dangan.txt"));
    }

    public static String readFile(String path){
        FileReader fr = null;
        int c = 0;
        StringBuffer sb = new StringBuffer();

        try {
            fr = new FileReader(path);
            while ((c = fr.read()) != -1) {
                sb.append((char)c);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("找不到指定文件");
        } catch (IOException e) {
            System.out.println("文件读取错误");
        }
        return sb.toString();
    }
}
