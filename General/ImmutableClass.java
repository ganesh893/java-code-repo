package General;

public final class ImmutableClass {

	private final int i;
	private final String s;
	private final Engine engine;
	
public ImmutableClass(int j, String str, Engine en) {
		this.i=j;
		this.s=str;
		Engine eng= new Engine(en.speed);
		this.engine=eng;
	}
public int getI() {
		return i;
	}
public String getS() {
		return s;
	}

	public static void main(String[] args) {
		
		Engine en= new Engine(50);
       ImmutableClass im= new ImmutableClass(1,"Ganesh",en);
       System.out.println(im.i);
     // im.i=10;
       System.out.println(im.s);
       System.out.println(im.engine.speed);
       im.engine.speed=10;
       //System.out.println(im.engine.speed);
       en.speed=10;
       System.out.println(im.engine.speed);
	}

}
