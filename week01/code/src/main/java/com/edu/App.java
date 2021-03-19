package com.edu;

import java.lang.reflect.Method;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception{
        //加载Hello.class
        MyClassLoader myClassLoader=new MyClassLoader();
        Class<?> aClass = myClassLoader.findClass("");
        Object o = aClass.newInstance();
        Method hello = aClass.getMethod("hello");
        hello.invoke(o);

        //加载Hello.xlass
        XlassLoader xlassLoader=new XlassLoader();
        Class<?> xClass = xlassLoader.findClass("");
        Object o1 = aClass.newInstance();
        Method xhello = aClass.getMethod("hello");
        hello.invoke(o);
    }
}
