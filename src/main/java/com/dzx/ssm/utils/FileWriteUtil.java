package com.dzx.ssm.utils;
import java.io.*;
/**
 * @Author:DingZhaoxiang
 * @Description:文本写入,可配合FileReadUtil实现文件拷贝功能
 * @Date 14:43  2018/4/12
 **/
public class FileWriteUtil {
    public static void main(String[] args) {
        writeFie("d:","text.txt","测试");
    }

    public static void writeFie(String path,String filename,String content){
        FileWriter fw = null;
        String realPath = path+"\\\\"+filename;
        try {
            fw = new FileWriter(realPath);//文件不存在时自动创建文件
            fw.write(content);
            fw.close();
        } catch (IOException e1) {
            e1.printStackTrace();
            System.out.println("文件写入错误");
            System.exit(-1);
        }
    }
}
