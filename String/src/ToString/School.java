package ToString;

import java.util.Date;
public class School {


		private String name;
		private String email;
		private Date dob;
		private Address address;
		private School spouse;

		public School() {
		}

		public School(String name, String email, Date dob) {
			super();
			this.name = name;
			this.email = email;
			this.dob = dob;
		}

		public School(String name, String email, Date dob, Address address) {
			super();
			this.name = name;
			this.email = email;
			this.dob = dob;
			this.address = address;
		}

		public School(String name, String email, Date dob, Address address, School spouse) {
			this.name = name;
			this.email = email;
			this.dob = dob;
			this.address = address;
			this.spouse = spouse;
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
			return "School [name=" + name + ", email=" + email + ", dob=" + dob + ", address=" + address + ", spouse="
					+ spouse + "]";
		}

	}

