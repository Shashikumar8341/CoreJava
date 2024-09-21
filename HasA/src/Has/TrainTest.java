package Has;

import java.util.Date;
public class TrainTest {
	
	public static void main(String[] args) {
		Date date = new Date("2000/08/02");
		//			System.out.println(date);

		Address add1 = new Address("ramagundam", "TS", 505208);
		Address add2 = new Address("mncl", "TS", 505209);
		Address add3 = new Address("secunderabad", "ts", 500008);
		Address add4 = new Address("lbnagar", "HYD", 500016);
		Address add5 = new Address("Mysammaguda", "kompally", 879626);

		Date date2 = new Date("1997/06/28");
		Date date3 = new Date("2002/08/02");
		Date date4 = new Date("2000/10/26");
		Date date5 = new Date("2002/10/26");
		Train p1 = new Train("Ramugiri", "ramagiri@train.com", 2806, date, add1);
		//			System.out.println(p1);

		Train p2 = new Train("SK", "sk@bollu", 426102, date2, add2);
		//			System.out.println(p2);

		Train p3 = new Train("Pinky", "Pinky@jmk", 622, date3, add3);

		Train[] p={p1, p2, p3};
		for (Train person : p) {
			System.out.println(person);
		}
	}

}
