package week3;

class A
{
	protected int number;
	protected String name;
	
	public A(int number, String name)
	{
		this.number = number;
		this.name = name;
	}
	
	public void Print()
	{
		System.out.println(this.number+","+this.name);
	}
}

class B extends A
{
	protected String address;
	
	public B(int number, String name,String address)
	{
		super(number, name);
		this.address = address;
	}
	public void Print() {
		super.Print();
		System.out.println(this.address);
	}
}


public class CSample {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B(10, "홍길동","구미시");
		
		b.Print();
	}*/

}