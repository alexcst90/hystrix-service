package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@EnableHystrixDashboard

@SpringBootApplication
public class HystrixServiceDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServiceDashboardApplication.class, args);
	}
}
