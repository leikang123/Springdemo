package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 整合方式一
 * @author mac1094
 *
 */
		
@SpringBootApplication
@ServletComponentScan
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
	}

}
