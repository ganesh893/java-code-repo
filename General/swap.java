package General;

public class swap {

	public static void main(String[] args) {

String s1="Ganesh";
System.out.println("ganesh's length :"+s1.length());
String s2= "Ashwini";
System.out.println("Ashwini length :"+s2.length());
System.out.println("string before swapping"+s1+":"+s2);

s1=s1+s2;
System.out.println(s1.length());
s2=s1.substring(0,s1.length()-s2.length());
System.out.println(" :"+s2.length());
s1=s1.substring(s2.length());
System.out.println("string before swapping:"+s1+":"+s2);

	}

}
