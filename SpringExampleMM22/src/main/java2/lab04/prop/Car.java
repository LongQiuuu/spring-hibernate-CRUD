package lab04.prop;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car implements ICarAnno {
	
	
//	將常數加入 使用value
	
	@Value("${lab04.prop.speed}")
	private Integer speed;
	
	@Value("${lab04.prop.hour}")
	private Double hour;
	
	@Value("${lab04.prop.brand}")
	private String brand;
	
	public Car() {
	}
	
	@Override
	public void getComment() {
		System.out.println(brand+"得車車走了" + speed * hour + "公里");
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Double getHour() {
		return hour;
	}

	public void setHour(Double hour) {
		this.hour = hour;
	}
	
}
