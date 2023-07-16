package com.baanBaini.users;

import com.baanBaini.commons.utils.CheckAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UsersApplication {

	public static void main(String[] args) {
		CheckAccess.getMessage();
		SpringApplication.run(UsersApplication.class, args);
	}

}
