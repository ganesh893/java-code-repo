package PracticePrograms;

public class MaximumNumberFromArray {

	public static void main(String[] args) {


		int[] iA={10,9,5,15,20,12};
		
		int temp=0;
		
		for(int i=0;i<iA.length;i++)
		{
			for(int j=i+1;j<iA.length;j++)
			{
				if(iA[i]>iA[j])
				{
					temp=iA[i];
					iA[i]=iA[j];
					iA[j]=temp;
				}
			}
		}
		System.out.println(iA[iA.length-1]);

	}

}
