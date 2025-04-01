package com.vivek.java8features.datetimeapi;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTImeExamples {
	public static void main(String[] args) throws InterruptedException {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);

		LocalDate demoDate = LocalDate.of(1996, 4, 1);
		System.out.println(demoDate);

		Period period = Period.between(today, demoDate);
		System.out.println(period.getYears() + " " + period.getMonths() + " " + period.getDays());

		LocalTime before = LocalTime.now();
		Thread.sleep(200);

		LocalTime after = LocalTime.now();

		Duration duration = Duration.between(before, after);
		System.out.println(duration.get(ChronoUnit.NANOS));

		int dayOfMonth = demoDate.get(ChronoField.DAY_OF_MONTH);
		System.out.println(dayOfMonth);

		LocalDate nextDay = today.plus(1, ChronoUnit.DAYS);
		System.out.println(nextDay.getDayOfWeek());

		LocalDate birthDay = LocalDate.of(2004, 2, 20);
		System.out.println(birthDay.getDayOfWeek());

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(birthDay.format(format));

		LocalDate formatedDate = LocalDate.parse(birthDay.format(format), format);
		System.out.println(formatedDate);
	}
}
