package ArrayList;

import java.util.*;

public class Parson {
	public static void main(String[] args) {

		ArrayList<mobile_Name> listofmobiles=new ArrayList<>();
		listofmobiles.add(new mobile_Name("sony",85000.00,15,"snapdragon851", 4500));
		listofmobiles.add(new mobile_Name("iphone",185000.00,14,"apple15", 3500));
		listofmobiles.add(new mobile_Name("pixel",35000.00,15,"snapdragon85", 3300));
		listofmobiles.add(new mobile_Name("lg",55000.00,15,"snapdragon450", 3000));
		listofmobiles.add(new mobile_Name("lg",55000.00,15,"snapdragon450", 3000));
//		listofmobiles.removeAll(listofmobiles);
		for (mobile_Name wewant : listofmobiles) {
			if (wewant.getamount()>=185000.00) {
//				System.out.println(wewant);
			}
		}	
		for (mobile_Name mobile_Name : listofmobiles) {
			if (mobile_Name.getBattery()>3000) {
//				System.out.println(mobile_Name);
			}
		}
		for (mobile_Name mobile_Name : listofmobiles) {
			if (mobile_Name.getName().startsWith("s")) {
				System.out.println(mobile_Name);
			}
			System.out.println(listofmobiles);
		}}
}
