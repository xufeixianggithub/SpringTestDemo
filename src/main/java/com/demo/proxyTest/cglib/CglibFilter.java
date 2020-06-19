package com.demo.proxyTest.cglib;

import net.sf.cglib.proxy.CallbackFilter;

import java.lang.reflect.Method;

public class CglibFilter implements CallbackFilter {
    @Override
    public int accept(Method method) {

        if("add".equals(method.getName())) {
            return 0;
        } else if("del".equals(method.getName())) {
            return 1;
        } else if ("query".equals(method.getName())) {
            return 2;
        } else {
            return 0;
        }
    }
}
