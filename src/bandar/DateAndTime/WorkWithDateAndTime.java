package bandar.DateAndTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class WorkWithDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime now = ZonedDateTime.now();
		LocalDateTime LDT = LocalDateTime.now(ZoneId.of("Asia/Riyadh"));
		LocalDate LD = LocalDate.now();
		LocalTime LT = LocalTime.now();
		Instant instant = Instant.now();
		
		//ZoneId.getAvailableZoneIds().forEach(System.out::println);
		System.out.println(LDT);
	}
}
