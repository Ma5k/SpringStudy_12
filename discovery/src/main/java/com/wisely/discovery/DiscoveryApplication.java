package com.wisely.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *	 一个常规的SpringBoot项目，我们只需要使用@EnableEurekaServer注解开启对EurekaServer的支持即可。
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {
    public static void main( String[] args ) {
        SpringApplication.run(DiscoveryApplication.class, args);
    }
}
