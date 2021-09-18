package MultipleInheritance;

public class InterfaceChild implements I1,I2{

	public void IMethod()
	{
		I1.super.IMethod();
		I2.super.IMethod();
	}
	
	public static void main(String[] args) {

InterfaceChild ic= new InterfaceChild();
ic.IMethod();

	}

}
