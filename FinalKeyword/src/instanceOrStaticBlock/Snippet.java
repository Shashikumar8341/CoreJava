package instanceOrStaticBlock;

public  final class Snippet {
	{
		System.out.println("it's institnce block");
	}
	public static void test() { //static block
		System.out.println("it's only test or variable..");
	}
	public static void main(String[] args) {
//		Snippet st=new Snippet();
		Snippet.test();
	}
	}


