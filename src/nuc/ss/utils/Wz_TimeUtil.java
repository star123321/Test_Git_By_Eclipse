package nuc.ss.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Wz_TimeUtil {

	public static String getTime() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = sdf.format(new Date());
		
		return format;
		
	}
	
}
