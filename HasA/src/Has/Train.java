package Has;

import java.util.Date;

public class Train {
	String name;
	String email;
	int platformId;
	Date dob;
	Address address;

	public Train() {
	}

	public Train(String name, String email, int platformId, Date dob, Address address) {
		this.name = name;
		this.email = email;
		this.platformId = platformId;
		this.dob = dob;
		this.address = address;
	}

	public Train(String name, String email, int platformId, Date dob) {
		super();
		this.name = name;
		this.email = email;
		this.platformId = platformId;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getplatformId() {
		return platformId;
	}

	public void setplatformId(int platformId) {
		this.platformId = platformId;
	}

	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Train [name=" + name + ", email=" + email + ", platformId=" + platformId + ", dob=" + dob + ", address=" + address
				+ "]";
	}

}