package com.rytc.loan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的启动类
 * 自动启动内置的tomcat
 * @author lzp
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.rytc.loan.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}