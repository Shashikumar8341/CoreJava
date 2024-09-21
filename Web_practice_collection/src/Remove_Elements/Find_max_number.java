package Remove_Elements;

public class Find_max_number {
public static void main(String[] args) {
	int[]a= {10,20,3,50,60,80,90};
	int max;
	for (int i = 0; i < a.length-1; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[i]<a[j]) {
				max=a[i];
				a[i]=a[j];
				a[j]=max;
			}
		}
		System.out.println(a[i]);
	}
}
}
