package d10x.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class D10xEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(D10xEurekaServiceApplication.class, args);
	}

}
