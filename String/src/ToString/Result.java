package ToString;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Result {

	public static void main(String[] args) throws ParseException {
		String customDate = "1985/09/21";
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/mm/dd");
		Date date = fm.parse(customDate);

		Address address1 = new Address("Ramagundam", "TS");

		School p1 = new School("vishwashanthi", "vishwashanthi@gmail.com", date, address1);
		System.out.println(p1);
		String SchDob = "1989/01/01";
		Date dobOfSch = fm.parse(SchDob);
		School anjali = new School("vishwabharathi", "vishwabharathi@ciq.com", dobOfSch);
		String govtzphsDob = "1987/01/01";
		Date dobOfgovtzphs = fm.parse(govtzphsDob);

		Address govtzphsAddress = new Address("Ramagundam", "TS");
		School p2 = new School("govtzphs", "govtzphs@ciq.com", dobOfgovtzphs, govtzphsAddress, anjali);
		System.out.println(p2);
		// System.out.println(p2.getDob());
		//			System.out.println(p2.getDob());

	}

}

