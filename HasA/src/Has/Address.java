package Has;

public class Address {

	String city;
	String State;
	int pincode;

	public Address() {
	}

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
		return "Address [city=" + city + ", State=" + State + ", pincode=" + pincode + "]";
	}

	//		@Override
	//		public String toString() {
	//			// TODO Auto-generated method stub
	//			return super.toString();

}
