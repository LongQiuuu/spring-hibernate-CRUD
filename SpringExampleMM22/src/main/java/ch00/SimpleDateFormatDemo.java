package ch00;

import java.text.SimpleDateFormat;
import java.util.Date;

//年月日 格式轉化類別
public class SimpleDateFormatDemo {

	public static void main(String[] args) {
		//SimpleDateFormat sdf = new SimpleDateFormat(樣板 日期的格式）
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH時mm分ss秒");
		
		//setLenient 預設是不嚴格的 設成false所以要他嚴格
		//如果沒這樣設 他會自動進位 //1995-23-47 --->1996-12-07
		sdf.setLenient(false); 
		sdf2.setLenient(false);
		
		Date now =new Date();
		
		String nowString =sdf.format(now);
		String nowString2 =sdf2.format(now);
		
		System.out.println(nowString);
		System.out.println(nowString2);
	}

}
