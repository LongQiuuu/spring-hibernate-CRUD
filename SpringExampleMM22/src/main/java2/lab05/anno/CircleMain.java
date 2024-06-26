package lab05.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab04.anno.ICarAnno;

/*
	改寫lab02，但以註釋的方式來定義Bean元件。
        請將相關的程式與組態檔寫在套件lab07.anno之下。
        改寫步驟 : 請參考Lab02與Lab05

 */
public class CircleMain {
    public static void main(String args[]) {
//       	Circle c = new Circle();
//       	c.setRadius(10);
//       	System.out.println("半徑為" + c.getRadius() + "之圓的面積為: " + c.getArea());
    	
    	ApplicationContext ctx =
				//new ClassPathXmlApplicationContext("放Beans 的路徑");
				new ClassPathXmlApplicationContext("/lab05/anno/Beans.xml");
		//呼叫BEAN
		ICircle circle =ctx.getBean(ICircle.class);
		System.out.println("半徑為" + circle.getRadius() + "之圓的面積為: " + circle.getArea());
		
		((ConfigurableApplicationContext)ctx).close();
    }
}
