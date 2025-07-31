package example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {  
 
	public String now() {
		Date nowDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		return dateFormat.format(nowDate);
	}

}
