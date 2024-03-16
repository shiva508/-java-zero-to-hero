package com.comrade.date_time.date.between;


import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class NumberOdDaysCalculator {
	public static void main(String[] args) {
		daysBetweenTwoDates();
		dateFormateAndCalculate();
		//dateManualFormateAndCalculate();

		Date startDate=new Date(System.currentTimeMillis()-(6363662+213131));
		Date endDate=new Date(System.currentTimeMillis());
		long startTime=startDate.getTime();
		long endTime= endDate.getTime();
		LocalDate startLocalDate=LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), TimeZone.getDefault().toZoneId()).toLocalDate();
		LocalDate endLocalDate= LocalDateTime.ofInstant(Instant.ofEpochMilli(endTime),TimeZone.getDefault().toZoneId()).toLocalDate();
		long daysBetween= ChronoUnit.DAYS.between(startLocalDate,endLocalDate);
		System.out.println(daysBetween);
	}

	private static void dateManualFormateAndCalculate() {
		String date="2001-07-04T12:08:56.235-0700";
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateFormat.format(date));
		
	}

	private static void dateFormateAndCalculate() {
		LocalDate startDate = LocalDate.parse("2017-09-11");
		LocalDate endDate=LocalDate.parse("2021-12-01");
		Long numberOfDays=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(numberOfDays);
	}

	private static void daysBetweenTwoDates() {
		LocalDate startDate = LocalDate.of(2017, Month.SEPTEMBER, 11);
		LocalDate endDate = LocalDate.of(2021, Month.DECEMBER, 1);
		Long numberOfDays=ChronoUnit.DAYS.between(startDate, endDate);
		System.out.println(numberOfDays);
	}
}
