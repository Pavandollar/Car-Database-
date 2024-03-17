package Customsorting;


import java.util.TreeSet;

public class Solution 
{
public static void main(String[] args) 
{

	Car c1 = new Car(500,"BMW");
	Car c2 = new Car(600,"AUDI");
	Car c3 = new Car(800,"LAMBO");
	
	TreeSet <Car> t = new TreeSet<Car>(new Nclass());
	
	t.add(c1);
	t.add(c2);
	t.add(c3);
	
	for(Car e : t)
	{
		System.out.println(e);
	}
	
}
}
