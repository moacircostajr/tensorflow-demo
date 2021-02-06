package com.vertice.tensorflowdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TensorflowDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TensorflowDemoApplication.class, args);
		HelloTensorFlow hello = new HelloTensorFlow();
		hello.hello();
	}

}
