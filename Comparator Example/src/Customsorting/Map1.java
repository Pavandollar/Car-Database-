package Customsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Map1 
{
	public static void main(String[] args) 
	  {
		
		  Map<String,Car> m1 =new LinkedHashMap<String,Car>()
;
		  
		  m1.put("white",new Car(80,"BMW"));
		  m1.put("Black",new Car(90,"AUDI"));
		  m1.put("green",new Car(100,"LAMBO"));
		  m1.put("red",new Car(70,"FERRARI"));
		  m1.put("purple",new Car(60,"TATA"));
		  
		  Set<String> keys = m1.keySet();
		  
		  List <Car> l1 = new ArrayList <Car>();
		  
		  for(String key : keys)
		  {
			 Car c = m1.get(key);
			 l1.add(c);
			 System.out.println(c);
		  }
		  
		  System.out.println();
		  
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("1:Sort based on brand\n2: Sort based on cost");
		  System.out.println("Enter choice");
		  int choice = sc.nextInt();
		  
		  switch(choice)
		  {
			  case 1: Collections.sort(l1,new Nclass());
			  for(Car c : l1 ) 
			  {
				  
				  System.out.println(c);
			  }
			  break;
			  
			  case 2: Collections.sort(l1,new Nclass2());
			     for(Car c : l1)
			     {
			    	 System.out.println(c);
			     }
			     break;
		      }
		 sc.close();
		  
	  
	  } 

}
