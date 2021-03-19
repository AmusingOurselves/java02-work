package com.edu;

import java.io.File;
import java.io.FileInputStream;

public class MyClassLoader extends ClassLoader{
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try{
            File classFile = new File("D:\\googleDownload\\java进阶\\作业相关\\Hello\\Hello.class");
            int length = (int) classFile.length();
            byte[] data = new byte[length];
            new FileInputStream(classFile).read(data);
            return defineClass(null, data, 0, length, null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return super.findClass(name);
    }
}
