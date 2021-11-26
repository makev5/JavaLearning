package com.xiaoke.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：
 *      在任意一个盘中创建一个文件夹，命名为java。
 *      在文件夹中创建一个文本文件，命名为javatest.txt
 *      使用代码向文件中写入（自己的学号+姓名）
 *      将文件复制到其他文件夹内。
 */
public class Copy {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\java");
        boolean md = file.mkdir();
        if (md){
            FileOutputStream out = new FileOutputStream("E:\\java\\javatest.txt");
            String str = "21631923115 马科";
            byte[] b = str.getBytes();
            for (int i = 0; i < b.length; i++) {
                out.write(b[i]);
            }

            int len;
            FileInputStream in = new FileInputStream("E:\\java\\javatest.txt");
            FileOutputStream op = new FileOutputStream("E:\\java1\\javatest.txt");
            while((len = in.read()) != -1){
                op.write(len);
            }
            out.close();
        }

    }
}
