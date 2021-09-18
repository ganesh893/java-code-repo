package MultiThreading;

public class RInterfaceDemo {

	public static void main(String[] args) {
		
		Hi o1= new Hi();
		Hello o2= new Hello();
		
		Thread t1= new Thread(o1);
		Thread t2= new Thread(o2);
		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();

	}

}
