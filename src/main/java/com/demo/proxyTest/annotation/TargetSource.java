package com.demo.proxyTest.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface TargetSource {
    String value() default "ds1";
}
