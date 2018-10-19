package com.yaml.yamlsample;

import com.yaml.yamlsample.config.factory.YamlPropertySourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import java.time.LocalDate;

@SpringBootApplication
@PropertySource(value = "classpath:My-Yaml-Example-File.yml", factory = YamlPropertySourceFactory.class)
public class YamlSampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(YamlSampleApplication.class, args);
	}


	@Value("${person.firstName}")
	private String firstName;

	@Value("${person.middleName}")
	private String middleName;

	@Value("${person.lastName}")
	private String lastName;

	@Value("${person.age}")
	private float age;

	@Value("${person.profession}")
	private String profession;

	@Value("${person.single}")
	private boolean single;

	@Value("#{T(java.time.LocalDate).parse('${person.birthDate}')}")
	private LocalDate birthDate;

	@Value("${person.singleLineDescription}")
	private String singleLineDescription;

	@Value("${person.multiLineDescription}")
	private String multiLineDescription;





	@Override
	public void run(String... args) throws Exception {
		System.out.println("first Name 				:" + firstName);
		System.out.println("middle Name  			:" + middleName);
		System.out.println("last Name  				:" + lastName);
 		System.out.println("age 	   				:" + age);
		System.out.println("profession 	   			:" + profession);
		System.out.println("birthDate 	   			:" + birthDate);
		System.out.println("single     				:" + single);
		System.out.println("singleLineDescription 	:" + singleLineDescription);
		System.out.println("multiLineDescription 	:" + multiLineDescription);
	}
}
