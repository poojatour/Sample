abstract class A
{
abstract void area();

}

class B extends A
{
	int l,w;
	 B(int a,int b)
	 {
		l=a;
		w=b;
		
	 }
	 
	 void area()
	 {
		int rarea;
		rarea=l*w;
		System.out.println("Reactangle area is:-"+rarea);
	 }

}

class C extends A
{
	int s;
	C(int a)
	{
		s=a;
	}
	void area()
	{
		int rarea;
		rarea =s*s;
		System.out.println("Square area is:-"+rarea);

		
	}
}

class AbstractDemo
{
	public static void main(String args[])
	{
		A a=new B(12,4);
		A a1=new C(4);
		a.area();
		a1.area();
		
	}
	
}

