package com.ohhoonim.demo_fileupload;

import org.springframework.boot.SpringApplication;

public class TestDemoFileuploadApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoFileuploadApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
