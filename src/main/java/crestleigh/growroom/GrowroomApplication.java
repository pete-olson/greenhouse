package crestleigh.growroom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class GrowroomApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(GrowroomApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GrowroomApplication.class, args);
	}

}
