package Java;

class anonimous {

	public static void main(String[] args) {
		
		Classone co =new Classone() {

			@Override
			public void implement() {
				System.out.println("implemented method in abstract class");
				
			}
			
		};
		co.print();
		co.implement();
	}
	
}
