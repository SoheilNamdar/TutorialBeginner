package com.tutorialbeginner.tutorialbeginner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableAutoConfiguration(
		exclude = {
				HibernateJpaAutoConfiguration.class
		}
)
public class TutorialbeginnerApplication implements CommandLineRunner {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		System.out.println("Hello spring boot");
		ConfigurableApplicationContext context = SpringApplication.run(TutorialbeginnerApplication.class, args);
		Person person1 = context.getBean(Person.class);
		person1.setName("Donya");
		person1.setSurname("Hajimohammadi");
		person1.setAddress("France");
		person1.setTel(912441453);
		System.out.println(person1.toString());
		person1.user.setEmail("donya@yahoo.com");
		System.out.println(person1.user.getEmail());
		Person person2 = (Person) context.getBean("person");
		person2.setSurname("Soheil");
		person2.setName("NAMDAR");
		person2.setAddress("IRAN");
		person2.setTel(919760744);
		System.out.println(person2.toString());
		person2.user.setEmail("soheilnamdar@yahoo.com");
		System.out.println(person2.user.getEmail());
	}

}
