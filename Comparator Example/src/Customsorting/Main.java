package Customsorting;

import java.util.ArrayList;

public class Main 
{
public static void main(String[] args) 
{

	Car c1 = new Car(500,"BMW");
	Car c2 = new Car(600,"AUDI");
	Car c3 = new Car(800,"LAMBO");
	
	ArrayList<Car> a = new ArrayList<Car>();

     a.add(c1);
     a.add(c2);
     a.add(c3);
     
     for(Car e : a)
 	{
 		System.out.println(e);
 	}
 	

}
}
