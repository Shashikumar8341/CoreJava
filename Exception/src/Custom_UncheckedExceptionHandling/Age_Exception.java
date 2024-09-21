package Custom_UncheckedExceptionHandling;

public class Age_Exception extends RuntimeException {
int age=18;

@Override
public String toString() {
	return "Age_Exception [age=" + age + "]";
}

}
