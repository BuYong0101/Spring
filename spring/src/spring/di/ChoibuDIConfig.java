package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.ChoibuExam;
import spring.di.entity.Exam;

@ComponentScan("spring.di.ui")
@Configuration
public class ChoibuDIConfig {
	
	@Bean
	public Exam exam() {
		return new ChoibuExam();
	}
}
