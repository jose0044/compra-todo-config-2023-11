package edu.example.compratodoconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CompraTodoConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompraTodoConfigApplication.class, args);
	}

}
