package String;

public class String_class_methods {

	public static void main(String[] args) {
		
		String s = "daksha";

System.out.println(s.length()); //6

System.out.println(s.toUpperCase());  //DAKSHA

System.out.println(s.toLowerCase()); // daksha

System.out.println(s.substring(3));  //sha

System.out.println(s.substring(0,5)); //daksh  it will consider index 0 but not 4 i.e. 4-1 =3

System.out.println(s.startsWith("sh")); //false

System.out.println(s.startsWith("da"));  //true

System.out.println(s.endsWith("sh"));   //false

System.out.println(s.endsWith("a"));	//true

System.out.println(s.charAt(3));  //s

System.out.println(s.indexOf('a'));   //1

System.out.println(s.lastIndexOf('a'));  //5

String s1 = "Daksha";
String s2 ="daksha";
String s4 = "vivan";
String s3 = "DAKSHA";
System.out.println(s.equals(s1));   //false

System.out.println(s.equals(s2));   //true

System.out.println(s.equals(s3));   //false

System.out.println(s.equalsIgnoreCase(s3));  //true

System.out.println(s.concat(s4));  //dakshavivan

System.out.println(s.replace("da","ra"));  //raksha

System.out.println(s.isEmpty());  //false

System.out.println(s.contains(s1));  //false

System.out.println(s.contains(s2));  //true

System.out.println(s.contains(s3));  //false





	}

}
