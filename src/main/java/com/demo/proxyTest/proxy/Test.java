package com.demo.proxyTest.proxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        //proxy对象就是xiaoming这个对象的一个代理实例，xiaoming这个对象就是一个被代理
        People proxy = (People)Proxy.newProxyInstance(Test.class.getClassLoader(),new Class<?>[]{People.class},
                new Parent(new Xiaoming()));
        proxy.zhaoduixiang();

        //createProxyClassFile();
    }

    public static void createProxyClassFile() {
        byte[] $Proxy0s = ProxyGenerator.generateProxyClass("$Proxy0", new Class[]{People.class});

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("$Proxy0.class");
            fileOutputStream.write($Proxy0s);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
