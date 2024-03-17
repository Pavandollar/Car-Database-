package Customsorting;

import java.util.Comparator;

public class Nclass implements Comparator<Car> 
{

	@Override
	public int compare(Car x, Car y) 
	{
		
		return x.Brand.compareTo(y.Brand);
	}
	

	

}
