package InterivewQuetions;

public class AllZeroToLast {

	public static void main(String[] args) {

		
		int[] arr={1,5,3,0,4,0,6,0,1,0,0,8};
		int length=arr.length;
		int count=0;
		for(int i=0;i<length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		while(count<length)
		{
			arr[count++]=0;
		}
		
		for(int i=0;i<length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}

}
