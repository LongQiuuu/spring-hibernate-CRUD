package lab04.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements ICarAnno {
	
	//如果有多個Integer 讓bean不知道注入哪個
	//使用@Autowired再加上@Qualifier(ID)
	
	
	//@Autowired幫我注入
	@Autowired
	private Integer speed;
	@Autowired
	private Double hour;
    
	public Car() {
	}
	
	@Override
	public void getComment() {
		System.out.println("此車走了" + speed * hour + "公里");
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
