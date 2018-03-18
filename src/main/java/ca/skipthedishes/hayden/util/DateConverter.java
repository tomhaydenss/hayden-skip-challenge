package ca.skipthedishes.hayden.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter {
	
	private static DateFormat dateTimeFormatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	private static DateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
	
	public static String dateToString(Date date) {
		return dateFormatter.format(date);
	}

	public static String dateTimeToString(Date dateTime) {
		return dateTimeFormatter.format(dateTime);
	}

	public static Date stringToDate(String str) {
		try {
			return dateFormatter.parse(str);
		} catch (ParseException e) {
			return new Date();
		}
	}

}
