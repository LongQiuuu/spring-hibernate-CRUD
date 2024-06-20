package lab00.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
//製作一個樂透號碼三位數
	public static void main(String[] args) {
//		ApplicationContext= IOC容器
		//建立IOC容器
		ApplicationContext ctx =
				//ClassPathXmlApplicationContext=透過類別路徑來尋找IOC容器
				//new ClassPathXmlApplicationContext("組態資訊放在這");
				new ClassPathXmlApplicationContext("/lab00/spring/xml/Beans.xml");
		
		//依賴注入
		//類別只有一個可以這樣寫
		//ILottery lottery = ctx.getBean(ILottery.class);
		//再印出 呼叫產生樂透號碼的方法 類別只有一個的時候這樣寫
		//System.out.println(lottery.getLuckyNumbers());
				
		//如果相同類別有兩個要改寫成 裡面裝id
		ILottery lottery = (ILottery)ctx.getBean("lottery");
		ILottery lottery2 = (ILottery)ctx.getBean("lottery2");
		//再印出 呼叫產生樂透號碼的方法 相同類別這樣印出
		System.out.println("大樂透："+lottery.getLuckyNumbers());
		System.out.println("大樂透2："+lottery2.getLuckyNumbers());
		
		//關閉IOC容器
		//因為ApplicationContext介面沒有
		//所以將ctx向下形象轉換 來關閉
		((ConfigurableApplicationContext)ctx).close();

	}

}
