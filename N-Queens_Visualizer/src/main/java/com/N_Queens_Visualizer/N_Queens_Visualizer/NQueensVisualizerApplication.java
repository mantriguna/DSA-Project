package com.N_Queens_Visualizer.N_Queens_Visualizer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class NQueensVisualizerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NQueensVisualizerApplication.class, args);
	}

}
