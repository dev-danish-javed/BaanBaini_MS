package com.baanBaini.users;

import com.baanBaini.commons.utils.CheckAccess;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UsersApplication {

	public static void main(String[] args) {
		CheckAccess.getMessage();
		SpringApplication.run(UsersApplication.class, args);
	}

}
