package com.demo.proxyTest.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

@Service
@ComponentScan(basePackages = {"com.demo.proxyTest"})
@EnableAsync
public class ComponentScanBean {
}
