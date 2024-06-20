package lab05.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Circle implements ICircle {
	public double radius;

	public Circle() {
	}
	@Autowired
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
}