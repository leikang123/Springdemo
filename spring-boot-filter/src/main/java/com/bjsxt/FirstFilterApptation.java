package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 启动类
 * @author mac1094
 *
 */
@SpringBootApplication
@ComponentScan(basePackages= {"com.bjsxt.filter"})
public class FirstFilterApptation {
	public static void main(String[] args) {
		SpringApplication.run(FirstFilterApptation.class, args);	
	}
}
