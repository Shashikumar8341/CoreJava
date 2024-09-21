package MethodChaining;

public class Ac {
	private  String name;
	private String inveter;
	private int rating;
	private int sense;
	private double price;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInveter() {
		return inveter;
	}
	public void setInveter(String inveter) {
		this.inveter = inveter;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getSense() {
		return sense;
	}
	public void setSense(int sense) {
		this.sense = sense;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void details() {
		System.out.println("The product name is:"+name+".cooling system is:"+inveter+".power saving mode is:"+rating+".generation is:"+sense+".Ac of cost is:"+price);

	}
	public static void main(String[] args) {
		Ac ac=new Ac();
		ac.setName("whirlpool");
		ac.setInveter("magiCool");
		ac.setRating(3);
		ac.setSense(6);
		ac.setPrice(35000.00);
		ac.details();}
}
