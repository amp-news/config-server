package com.amp.configsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigSvrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigSvrApplication.class, args);
	}

}

