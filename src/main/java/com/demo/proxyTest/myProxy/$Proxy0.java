package com.demo.proxyTest.myProxy;
import java.lang.reflect.Method;
public class $Proxy0 implements com.demo.proxyTest.myProxy.People{
MyInvocationHandler h;
public $Proxy0(MyInvocationHandler h) {
this.h=h;
}public void zhaoduixiang() throws Throwable {
Method md = com.demo.proxyTest.myProxy.People.class.getMethod("zhaoduixiang",new Class[]{});
this.h.invoke(this,md,null);
}

}