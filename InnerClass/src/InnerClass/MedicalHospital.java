package InnerClass;

import java.util.Arrays;
import java.util.Comparator;

public class MedicalHospital {

	private int typeOfMedical;
	private String hospitalName;
	private double billPrice;

	public MedicalHospital(int typeOfMedical, String hospitalName, double billPrice) {
		this.typeOfMedical = typeOfMedical;
		this.hospitalName = hospitalName;
		this.billPrice = billPrice;
	}

	public int gettypeOfMedical() {
		return typeOfMedical;
	}

	public void settypeOfMedical(int typeOfMedical) {
		this.typeOfMedical = typeOfMedical;
	}


	public String gethospitalName() {
		return hospitalName;
	}


	public void sethospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}




	public double getbillPrice() {
		return billPrice;
	}


	public void setbillPrice(double billPrice) {
		this.billPrice = billPrice;
	}

	@Override
	public String toString() {
		return "MedicalHospital [typeOfMedical=" + typeOfMedical + ", hospitalName=" + hospitalName + ", billPrice=" + billPrice + "]";
	}

	public static void main(String[] args) {
		MedicalHospital p1 = new MedicalHospital(300, "Alpha Health Care", 59000.00);
		MedicalHospital p2 = new MedicalHospital(400, "Gold River Hospital", 29000.00);
		MedicalHospital p3 = new MedicalHospital(256, "Serenity South Hills", 19000.00);
		MedicalHospital p4 = new MedicalHospital(156, "Charlotte Eye Group", 59900.00);
		MedicalHospital p5 = new MedicalHospital(586, "24hr Homecare", 109000.00);


		MedicalHospital[] names = { p1, p2, p3, p4, p5 };

		// anonymous inner class
		Comparator<MedicalHospital> productSort=new Comparator<MedicalHospital>() {

			@Override
			public int compare(MedicalHospital p5, MedicalHospital p1) {
				return (p5.gethospitalName().compareTo(p1.gethospitalName()));
			}
		};
		Arrays.sort(names, productSort);

		for (MedicalHospital name : names) {
			System.out.println(name);
		}

	}

}

