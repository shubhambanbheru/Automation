package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist2 {

	public static void main(String[] args)
	{
	
		//Declaration
	
		//ArrayList-->inbuild class-->to create object that class 

		ArrayList al = new ArrayList();
	
		//1.Duplicates are allowed in ArrayList

		//(1) .add()-->Appends the specified element to the end of this list

		//append-increasing length of this sequence

		al.add("abc"); //String name 
		al.add(100); //int roll no 
		al.add('A'); //char grade 
		al.add(55.5f); //float per 
		al.add(100); //duplicate
		
		//2. allow any no of null value
	
		al.add(null);
		al.add(null); 
		System.out.println(al);
		
		//(2) .size()-->Returns the number of elements in this list 
	
		System.out.println(al.size()); //7
		
		//(3) .isEmpty()-->Returns true if this list contains no elements.
	
		System.out.println(al.isEmpty()); //false
	
		//(4) .get(int index)-->Returns the element at the specified position in this list.
	
	
		System.out.println(al.get(3)); //55.5
	
		//(5) .contains(object)-->Returns true if this list contains the specified element 
	
		System.out.println(al.contains("abc")); //true 
	
		System.out.println(al.contains('B')); //false
	
		//(6) .indexOf(object)-->Returns the index of the first occurrence of the specified element in this 
	//	list, or -1 if this list does not contain the element.
	
		System.out.println(al.indexOf("abc")); //0 
	
		System.out.println(al.indexOf(null)); //5
	
		//(7) .lastIndexOf()-->Returns the index of the last occurrence of the specified element in this list, 
	
	//	or -1 if this list does not contain the element.
	
		System.out.println(al.lastIndexOf('A')); //2 
	
		System.out.println(al.lastIndexOf(null)); //6 
	
		System.out.println(al.lastIndexOf(100)); //4
	
		//(8) .add(int index, Object element)-->Inserts the specified element at the specified position in 
		//	this list. Shifts the element currently at that position (if any) and any subsequent elements to the 
		//	right (adds one to their indices).
		//insert info in between ArrayList-->right shift operation 
		
		al.add(5, 10000);
		System.out.println(al);
	
		//(9) .remove(int index)-->Removes the element at the specified position in this list.
		//Shifts any subsequent elements to the left (subtracts one from their indices).
		//remove/delete info in between ArryList-->left shift operation 
	
		al.remove(5);
		System.out.println(al);
		
		//(10) .set(int index, Object element)-->Replaces the element at the specified position in this list 
		//with the specified element
		//update/modify info in ArrayList
		
		al.set(0, "xyz");
		System.out.println(al); //replace abc to xyz
		
		//using iterator cursor
	
		System.out.println("--print all info in arraylist using iterator cursor---"); 
	
		Iterator itr = al.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	
		//using listiterator cursor
		
		System.out.println("--print all info in arraylist using listiterator cursor---"); 
	
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		//using for loop
	
		System.out.println("--print all info in arraylist using for loop---");
		for(int i=0; i<=al.size()-1; i++)
		{
			System.out.println(al.get(i));
		}
		//using for each loop
		
		System.out.println("--print all info in arraylist using foreach loop---");
		for(Object s1:al)
		{
			System.out.println(s1);	

		}
}
}