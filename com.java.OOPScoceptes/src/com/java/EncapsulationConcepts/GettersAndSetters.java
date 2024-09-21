package com.java.EncapsulationConcepts;

public  class GettersAndSetters {
	private long acc_no;  
	private String email;  
	private float amount;  
	public GettersAndSetters() {//objects
	}
	private long getacc_no(){
		return acc_no;
	}
	private void setacc_no(long getacc_no) {
		this.acc_no=getacc_no;
	}
	private String getemail() {
		return email;
	}
	private void setemail(String getemail) {
		this.email=getemail;
	}
	private float getamount() {
		return amount;
	}
	private void setamount(float getamount) {
		this.amount=getamount;
	}
	public static void main(String[] args) {
		GettersAndSetters gas=new GettersAndSetters();
		gas.setacc_no(62364057688L);
		gas.setamount(85260);
		gas.setemail("shash@gmail.com");
		System.out.print(gas.getacc_no()+" "+gas.getemail()+" "+gas.getamount());
	}}
