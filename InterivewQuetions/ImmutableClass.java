package InterivewQuetions;

public final class ImmutableClass {

	private final int i;
	private final String s;
	private final IclassTwo ic;
	public int getI() {
		return i;
	}
	public String getS() {
		return s;
	}
	
	private ImmutableClass(int i,String s,IclassTwo c){
		this.i=i;
		this.s=s;
		IclassTwo ic= new IclassTwo(i);
		this.ic=ic;
		
	}
	
	public void disp()
	{
		System.out.println(i+" "+s+" "+ic.speed);
	}
	
	public static void main(String[] args) {
      IclassTwo c2= new IclassTwo(50);
		ImmutableClass i= new ImmutableClass(10,"Ganesh",c2);
		i.disp();
		c2.speed=20;
		i.disp();
	}

}
