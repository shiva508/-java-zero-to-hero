package com.comrade.date_time.period;

import java.time.Period;

public class PeriodFrom {

	public static void main(String[] args) {

		Period period = Period.from(Period.of(20, 10, 5));
	      System.out.println(period);
	}
}
