package General;

public class ArrayObject {

	public static void main(String[] args) {
		
		Object[] a= new Object[10];
		a[0]="ganesh";
		a[1]=Integer.valueOf(10);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		String s= (String)a[0];
		int n= (int)a[1];

	}

}
