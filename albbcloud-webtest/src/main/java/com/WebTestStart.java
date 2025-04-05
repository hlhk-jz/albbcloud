package com;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.concurrent.atomic.AtomicStampedReference;

@SpringBootApplication
@EnableDiscoveryClient // 如果使用Nacos等注册中心，则需要此注解
public class WebTestStart {
    public static void main(String[] args){
     SpringApplication.run(WebTestStart.class,args);
     System.out.println("WebTestStart启动成功。。。。。");
    }
}
