package BGroup_2;

import java.time.LocalDate;
import java.util.*;

abstract class p1{
	int ynum=80;
	static int Tnum=100;
	abstract public void method1();
	
	public static void method3() {
	//	System.out.println(ynum);  y num is nonestatic.
		Tnum=200;
	}
}
interface i{
		int znum=90;
	abstract public void method2();
			public void method3();
			public String method4();   
			// none static methods in interface by default are abstract method.
	
			public static void xxx() {
				System.out.println(znum);
			//	znum=100;
			}
}

public class JavaReviews {
//	abstract public  void method();
	public static void main(String[] args)  {
		
	
		/*
		 		Java, Selenium, Cucumber.
		 		
		 		1. Java: Collections, OOP, Exceptions, Map
		 		
		 		interface extends extends interface
		 		class extends class.
		 		class implements interface.
		 		
		 0. iterator (Enumeration).		
		 		1. Collection (I): List(I), Set(I), Queue(I)     ==>inheritance. 
		  				1. List(I): implemented by ArrayList, LinkedList(fastest) ,  Vector (slowest)
		  						it takes duplicates. it has index nums.
		  						sort the list: Collections.sort(listname).
		  						sort the Array: Arrays.sort(arrayName).
		  						
		  				2. Set(I): extended by SortedSef(I) ( implemented by TreeSet (c)).
		  						  implemented by HashSet, LinkedHashSet.
		  						  
		  						  SortedSet: it sorts the elemnts 
		  						  
		  						does not take duplicates, doesnt have index orders.
		  				
		  				3. Queue (I): extends by DeQueue(I) (implemented by LinkedList)
		  				 				implemnetd by priorityqueue (C)
		  							it accepts duplicates, it does not have index nums.
		  							
		  	
		  	2. Map<Key, Value>(I): implemented by HashMap(c , extended by linkedhashmap(c)), Hashtable(c).
		  							extended by SortedMap(I) ==> implemented by TreeMap (C).
		  						  
		  			hashtable and hashmap: hashtable does not accept null.
		  			sortedmap and Treemap: sorts the Key.
		  			
		  			KEY cannot be duplicated. if keys are duplicated will take latest one.
		  	
		  	
		  	3. OOP: Encapsulations, Inheritance, Abstraction and Polymorphisim.
		  	
		  			1. inheritance (extends):build relations between classes, (super and sub)
		  			      class A (sub class) extends class B (super class).
		  			      		A can call all the members of B (none private).
		  		Relations:	     
		  		
		  				
		  		 		  Is a: A extended by B and  B extended by C
		  			      Has a: A extended by B and C.
		  			      
		  		2. Encapsulation: it grants other class or object get access to private data through getters and setters.
						getter: it's a return methods, returns the private.  (to the other objects the getter is for read only.)
						setter: it passes a parameter, and assigns it to the private data.
					
				
				3. abstraction: hiding the implementations.	
									abstract public void mtheod();
							abstract method(has no body): methods that meant to be override.
								restriction of abstract method: cannot have final, static, private, 
								
						abtsratc methods can only be created in interface and abstract class.
										
						abstract class are meant to be extended, and interface meant to be impelemnted so we cannot have final keywords for both.
						
						instance variables in interface are static and final by default.
				if abstract class and interface are reference, object has to be regular implement class or child class.
							interface and abstratc class cannot be object.
							
				
				4. Polymorphisim: behaviors of the objects in diffeent forms:
						A obj=new B();
						refrence decides what methods can be called. 
						
						override one will always return.
							
						final: 
							final variable: it cannot be changed, or reassigned.
							final methods: cannot be override.
							final class: cannot be extended.
		  	
		  	4. Exceptions:
		  	 	 	1. checked Exception: compile time ( needs to be handled immidietly.) 	  
		  	 	 	2. uncheked Exceptions:  runtime. 
		  
		  throw and throws:  throws is signature decleration.
		  					throw creates the object of the exception (inside the method).

		 */
		
		
		try {
			Thread.sleep(2000);    // if the caught exception is checked, catch block will not be exceuted.
			System.out.println("Hello");
			
		} catch(Exception e) {
			System.out.println("World");
		}
		
//		throw new RuntimeException();
		
		try {
		int x1=10/0;
		}catch (Exception e) {   // catch block is only executed if the exception is unchked.
			System.out.println("catch executed in uncheked exception");
		}
			
	
		
			HashMap<String, Integer> mp2=new LinkedHashMap<>(); // linkedhash map is child class of hash map.
			
			Map<String, Integer> mp=new HashMap<>();
					
					
			List<Integer> list=new ArrayList<>();
					list.add(10);
					list.add(10);
					list.add(10);
					list.add(10);
				
//					for(int i=0; i<list.size();i++)
//						System.out.println( list.get(i) );
//		
					SortedSet<Integer> st=new TreeSet<>();
							st.add(50);
							st.add(20);
							st.add(30);
							st.addAll(list);
					
				// 	st.forEach(System.out::println );
				Iterator<Integer> it=st.iterator();
					
					while( it.hasNext() )
						System.out.println(it.next());
		
					System.out.println("======================");
					
					HashMap<String, Integer> hm=new HashMap<>();
							hm.put("D", 9);
							hm.put("D", 10);
							hm.put("D", 11);
							hm.put("D", 12); 
							System.out.println(hm);	
					
	}

}







