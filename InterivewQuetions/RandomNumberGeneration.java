package InterivewQuetions;

import java.util.Random;

public class RandomNumberGeneration {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int uperBound=100;
		int ra=ran.nextInt(uperBound);
		double dran=ran.nextDouble();
		float fran=ran.nextFloat();
		System.out.println((uperBound-1)+" :"+ra);
		System.out.println((uperBound-1)+" :"+dran);
		System.out.println((uperBound-1)+" :"+fran);

	}

}
