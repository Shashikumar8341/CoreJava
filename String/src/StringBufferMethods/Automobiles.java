package StringBufferMethods;

public class Automobiles {
	public static void main(String args[]){  
		StringBuffer am =new StringBuffer("name");
		am.append("shashi");
		System.out.println(am);
		am.insert(1,"shashi");
		System.err.println(am);
		am.capacity();
		System.out.println(am.capacity());
		System.out.println(am.replace(1, 3, "kumar"));
	}  
}  

