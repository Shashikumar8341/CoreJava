package ImmutableString;

public class Test {
	String name;
	public static void main(String[] args) {
		String t=new String();	
		String t1=new String();	
		t="shashi";
		t1="kumar";
		System.out.println(t.concat(t1));

		String st="shashi";
		st=st.concat("kumar");
		System.err.println(st);
	}
}
