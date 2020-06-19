package com.demo.proxyTest.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DelInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("DelInterceptor.intercept.before");
        proxy.invokeSuper(obj,args);
        System.out.println("DelInterceptor.intercept.after");
        return null;
    }
}
