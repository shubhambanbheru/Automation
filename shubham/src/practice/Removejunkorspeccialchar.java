package practice;

public class Removejunkorspeccialchar {

	public static void main(String[] args) {
		
		String s1= "Java @!#$ Automation #@%^";
		
		
		System.out.println(s1.replaceAll("[^a-zA-Z0-9]", ""));
	}
}
