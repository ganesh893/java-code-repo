package PracticePrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteFirstWordsFromString {

	public static void main(String[] args) {

String s="hello i am ganesh";

s=s.substring(s.indexOf(" "));
System.out.println(s);

/***************************************
 swap first two words from the string
 * **/
s="hello i am ganesh";
//System.out.println(s);

String[] ss=s.split(" ");
String s1=ss[0];
String s2=ss[1];
//System.out.println(s1+" "+s2);
s1=s1+s2;
System.out.println(s1);
s2=s1.substring(0, s1.length()-1);
s1=s1.substring(s2.length());
System.out.println(s1+"  "+s2);

ss[0]=s1;
ss[1]=s2;


for(String str1:ss)
{
	System.out.println(str1);
}
String str=Arrays.toString(ss);
System.out.println(str);
str=str.substring(1,str.length()-1);
System.out.println(str);

	}

}
