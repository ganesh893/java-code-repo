package MultiThreading;

public class TDemo {

	public static void main(String[] args) {
		
		Hi o1= new Hi();
		Hello o2= new Hello();
		
		o1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		o2.start();

	}

}
