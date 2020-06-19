package com.demo.proxyTest.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


//这个是对add方法的一个拦截
public class AddInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("AddInterceptor.intercept.before");
//        method.invoke(obj,args);
        proxy.invokeSuper(obj,args);
        System.out.println("AddInterceptor.intercept.after");
        return null;
    }
}
