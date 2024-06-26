package lab06.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarMain {
	public static void main(String[] args) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("lab06/Beans.xml");
		
		AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(JavaConfig.class);
		ICar car1 = ctx.getBean(ICar.class);
		car1.getComment();
		((ConfigurableApplicationContext)ctx).close();
	}
}