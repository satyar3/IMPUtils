package utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConverter {

	public void seasonDateFormatter() {
		String seasonDate = "01/01/1990";
		DateTimeFormatter fParse = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.US);

		LocalDate updSeasonDate = LocalDate.parse(seasonDate, fParse);
		LocalDate updFlightEndDate = LocalDate.parse(updSeasonDate + "");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMMYY");
		String sDate = formatter.format(updFlightEndDate).toString();
	}

}
