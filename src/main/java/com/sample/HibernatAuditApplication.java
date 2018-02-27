package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author HsuWaiWaiTun
 *
 */
@SpringBootApplication
@ComponentScan("com.sample")
public class HibernatAuditApplication {

	public static void main(String[] args) {
		SpringApplication.run(HibernatAuditApplication.class, args);
	}
}
