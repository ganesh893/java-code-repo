package InterivewQuetions;

public class SwapString {

	public static void main(String[] args) {

String s1="Ganesh";
String s2="PAtkal";
s1=s1+s2;
s2=s1.substring(0,(s1.length()-s2.length()));
s1=s1.substring(s2.length());
System.out.println(s1+" "+s2);
	}

}