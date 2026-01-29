/*package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo2")
@EnableJpaRepositories(basePackages = "com.example.demo2.Repository")
/*public class Demo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
*/
package com.example.demo2;

import com.example.demo2.model.reader;
import com.example.demo2.Repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(ReaderRepository repository) {
        return (args) -> {
            if (repository.count() == 0) {
                repository.save(new reader("java success", 45, "demo", "password1234"));
                System.out.println("Initial data aded to the repository");
            }
        };
    }
}

