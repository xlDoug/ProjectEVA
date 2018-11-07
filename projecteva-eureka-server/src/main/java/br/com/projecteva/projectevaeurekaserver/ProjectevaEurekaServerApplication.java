package br.com.projecteva.projectevaeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ProjectevaEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectevaEurekaServerApplication.class, args);
	}
}
