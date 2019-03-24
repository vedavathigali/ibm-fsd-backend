package com.examples.java.time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LegactDateTimeEx {
	public static void main(String args[]) {
		//todays date
		Date today=new Date();
		System.out.println(today);
		//yesterday date
		Date yesterday=new Date("2019/03/14 14:30:00");
		System.out.println(yesterday);
		//1970 01 jan
		long timeInMillis=Date.parse("2019/03/14 14:30:00");
		Date date=new Date(timeInMillis);
		Calendar calendar=Calendar.getInstance();
		System.out.println(calendar.getTimeInMillis());
		System.out.println(calendar.getTime());
		System.out.println(calendar.getWeekYear());
		LocalDate today1= LocalDate.now();                          //Today's date
		LocalDate birthday = LocalDate.of(1997, Month.FEBRUARY, 28);  //Birth date
		 
		Period p = Period.between(birthday, today1);
		System.out.println("age of employee is"+p.getYears());
	
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");                 //Today's date
		System.out.println(LocalDateTime.parse("28-02-1997",formatter));; //Birth date
		
	}

}
