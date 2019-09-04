package d10x.task.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class D10xTaskManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(D10xTaskManagerApplication.class, args);
	}

}
