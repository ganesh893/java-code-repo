package General;

import java.util.*;


public class Largest_Number_In_Array {

	public static void main(String[] args) {
		
		int[] num={2,1,4,5,10,40,3};
		int length=num.length;
		System.out.println(num.length);
		int temp;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(num[i]>num[j])
				{
				temp=num[i];// temp=2
				num[i]=num[j];//num[i]=1
				num[j]=temp;//num=2
				}
			}
		}
      System.out.println(num[length-1]);
      
      //find largest number in array using arrays
      Arrays.sort(num);
      System.out.println("Using arrays :"+num[length-1]);
      
      //using collection
     // List<int[]> list=  Arrays.asList(num);
     // Collections.sort(list);
      
	}

}
