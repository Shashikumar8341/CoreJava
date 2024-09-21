package CustomExceptionHandling;

public class customException extends Exception{
	String st;
		customException(String st){
			this.st=st;
		}
		
		public String toString() {
			return "customException [st=" + st + "]";
		}
	
}
