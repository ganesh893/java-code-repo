package Interface;
		
		public class BMW implements Car {
	public void breaks()
	{
		
		System.out.println("yes have brek system");}
	   public static void main(String[] args) {
		BMW b= new BMW();
		b.breaks();
		Car.safty();
		b.run();
		
	}

}
