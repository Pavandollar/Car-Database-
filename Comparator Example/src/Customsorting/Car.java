package Customsorting;

public class Car 
{
 int cost;
 String Brand;
public Car(int cost, String brand) 
{
	super();
	this.cost = cost;
	Brand = brand;
}
@Override
public String toString() 
{
	return "Car [cost=" + cost + ", Brand=" + Brand + "]";
}

 
}
