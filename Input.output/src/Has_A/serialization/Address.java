package Has_A.serialization;

import java.io.Serializable;

public class Address implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3146908819426814509L;
	String city;
	String State;
	int pincode;


	public Address(String city, String state, int pincode) {
		super();
		this.city = city;
		State = state;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return  "Employee [city=" + city + ", state=" +State + ", pincode=" + pincode + "]";
	}
}
