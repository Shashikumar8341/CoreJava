package variableClassConcept;

public  class Finalvariable {
//	final void a() {
//		int a = 20;
//		System.out.println(a);
//	}
//	public static void s() {
//		int a = 30;  
//	}
//	public static void main(String[] args) {
//		Finalvariable st =new Finalvariable();
//		st.a();
//	}

final String name;
public Finalvariable(String name) {
	this.name = name+"kumar";
	System.out.println(name);
}
public static void main(String[] args) {
	Finalvariable fv=new Finalvariable("kumar");
	
}
}