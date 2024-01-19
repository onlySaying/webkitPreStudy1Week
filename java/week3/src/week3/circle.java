package week3;

public class circle {
	int radius;
	String name;
	public circle()
	{
		radius = 1;
		name = "";
	}
	public circle(int r)
	{
		radius = r; 
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args)
	{
		circle[] c;
		c = new circle[5];
		
		for(int i = 0; i < c.length; i++)
		{
			c[i] = new circle(i);
		}
		for(int i = 0; i < c.length; i++)
		{
			System.out.print((int)(c[i].getArea()) + " ");
		}
	}
}
