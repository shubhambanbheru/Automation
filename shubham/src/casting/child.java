package casting;

public class child extends Parent {
	
	int id ;

 void method() {
		
		System.out.println("Method from child");
		
		
	}
	
	public static void main(String[] args) {
		
		//up casting done implicitly
		
		Parent p =new child();
		
		p.name ="child";
		
		System.out.println(p.name);
		////parent class method is overridden method hence this will be executed
		p.method();
		
		//down casting done implicitly

	//	child c =new Parent();
		
		child c =(child)p;
		
		System.out.println(c.name);
		c.id=1;
		System.out.println(c.id);
		c.method();
		
	}
	
		
	

}
