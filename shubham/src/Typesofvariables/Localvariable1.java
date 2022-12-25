package Typesofvariables;

public class Localvariable1 {
	int a=30;
	public static void main(String []args) {
		
		Localvariable1 s=new Localvariable1();
		 
		s.m1();
		
		
		
	}
	public void m1() {
		int a=20;
		System.out.println(a);
		
		System.out.println(this.a);

	}
	
}
