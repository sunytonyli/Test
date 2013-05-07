package com.tony.test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

/**
 * @author Tony
 * @createDatime 2013-3-12 下午5:38:43
 */
public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		java.util.Date now = new java.util.Date();
		int intdate = (int) (now.getTime() / 1000);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		
		System.out.println(df.format(now));
		
		System.out.println(intdate*1000/3600);
	}

}
