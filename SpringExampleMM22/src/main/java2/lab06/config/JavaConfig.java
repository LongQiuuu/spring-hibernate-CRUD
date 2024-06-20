package lab06.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration

//PropertySourc 告訴他常態組數放在哪裡
@PropertySource("labs.properties")
public class JavaConfig {
	
	@Value ("${lab06.config.speed}")
	int speed;
	@Value ("${lab06.config.hour}")
	double hour;
	
	
	@Bean
	public Car car() {
		Car c= new Car();
		c.setHour(hour);
		c.setSpeed(speed);
		return c;
	}
}
