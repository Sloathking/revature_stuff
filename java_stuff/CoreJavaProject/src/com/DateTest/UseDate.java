package com.DateTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class UseDate {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowTime);
		
		LocalDateTime rightNow = LocalDateTime.now();
		System.out.println(rightNow);
		
		LocalDate newDate = LocalDate.of(2026, 5, 20);
		System.out.println(newDate);
		
		System.out.println("Year: " + today.getYear());
		System.out.println("Month: " + today.getMonth());
		System.out.println("Day: " + today.getDayOfMonth());
		System.out.println("Day of Week: " + today.getDayOfWeek());
		
		System.out.println("After 10 days: " + today.plusDays(10));
		System.out.println("2 months ago: " + today.minusMonths(2));
		System.out.println("After 1 year: " + today.plusYears(1));
		
		Period period = Period.between(newDate, today);
		System.out.println(period);
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
		
		DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String formatted = today.format(dateTime);
		System.out.println(formatted);
		
		String inputDate = "06-11-2003";
		LocalDate dateFormat = LocalDate.parse(inputDate, dateTime);
		System.out.println(dateFormat);
	}
}
