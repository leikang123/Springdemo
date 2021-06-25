package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.bjsxt.servlet.ScoedServlet2;

/**
 * 整合方式2
 * @author mac1094
 *
 */
		
@SpringBootApplication
public class App2 {
	public static void main(String[] args) {
		SpringApplication.run(App2.class, args);
	}
}
