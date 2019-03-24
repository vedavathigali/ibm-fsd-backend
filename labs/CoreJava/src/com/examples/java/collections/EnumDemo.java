package com.examples.java.collections;

public class EnumDemo{
	 public enum WeekDays{
		 MONDAY{//overriding the getDiplayName method
			 public String getDisplayName() {
				 return "monday";
			 }
		 },
		 TUESDAY,
		 WEDNESDAY,
		 THURSDAY,
		 FRIDAY,
		 SATURDAY,
		 SUNDAY;
		 private int dayIndex;
		 private WeekDays() {
			 System.out.println("constructor called");
			 }
		 private WeekDays(Integer dayIndex) {
			 System.out.println(" overloaded constructor called");
			 this.dayIndex=dayIndex;
			 }
		 public String getDisplayName() {
			 return "enum method test";
		 }
		 };
	public static void main(String args[]) 
	{
		String day="MONDAY";
		if(day.equals("MONDAY"))
		{
		System.out.println("Given day is monday");
	}
		//converting enum weekdays.monday in to string
		
		if(WeekDays.MONDAY.toString()==day) {
			System.out.println("Given day is monday");
		}
		//converting string in to enum type
		if(WeekDays.MONDAY==WeekDays.valueOf(day)) {
			System.out.println("Given day is monday");
		}
		//view all enums
		for(Object WeekDay:WeekDays.values()) {
			System.out.println(WeekDay);
		}
		System.out.println(WeekDays.MONDAY.getDisplayName());
		System.out.println(WeekDays.WEDNESDAY.getDisplayName());
	
		}

}
