package bandar.DateAndTime;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class WorkWithDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		LocalDateTime LDT = LocalDateTime.now(ZoneId.of("Asia/Riyadh"));
		LocalDate LD = LocalDate.now();
		LocalTime LT = LocalTime.now();
		Instant instant = Instant.now();
		
		//ZoneId.getAvailableZoneIds().forEach(System.out::println);
		System.out.println(LDT);
		
		final String FROM = "yyyy-MM-dd";
		final String TO = "dd.MM.yyyy";
		final String INPUT = "2022-01-01";
		
		System.out.println(convertDate(INPUT, FROM, TO));
	}
	
	public static String convertDate(String input, String from, String to) {
		String output = null;
		
		try {
			SimpleDateFormat fromFormat = new SimpleDateFormat(from);
			SimpleDateFormat toFormat = new SimpleDateFormat(to);
			
			Date date = fromFormat.parse(input);
			output = toFormat.format(date);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return output ;
	}
}
