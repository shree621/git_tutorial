package main;

public class First {
	
	   void mul()
	   {
		   int x=58;
		  int  y=20;
		  int mul=x-y;
		   System.out.println("X="+x+" "+"Y="+y);
		   System.out.println("multiplication="+mul);
	   }
	
	public static void main(String[] args) {
		
		int a=10,b=20,add;
		add=a+b;
		System.out.println("addition="+add);
		System.out.println("hello world");
		
		First f=new First();
		f.mul();
	}

}
