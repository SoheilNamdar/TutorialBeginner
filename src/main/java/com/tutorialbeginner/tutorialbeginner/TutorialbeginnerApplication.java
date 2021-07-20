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
	PersonDao personDao;

	public static void main(String[] args) {
		System.out.println("Hello spring boot");
		ConfigurableApplicationContext context = SpringApplication.run(TutorialbeginnerApplication.class, args);

	}

		@Override
		public void run(String... args) throws Exception {
			personDao.persist();
		}

}
