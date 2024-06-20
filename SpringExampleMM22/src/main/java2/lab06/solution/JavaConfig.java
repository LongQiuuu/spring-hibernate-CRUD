package lab06.solution;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
	public Car car() {
		Car car1 = new Car();
		car1.setSpeed(100);
		car1.setHour(3.0);
		return car1;
	}
}
