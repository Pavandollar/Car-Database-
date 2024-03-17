package Customsorting;

import java.util.Comparator;

public class Nclass2 implements Comparator<Car>
{

	@Override
	public int compare(Car x, Car y) 
	{
		return x.cost-y.cost;
	}

}


//x -> object to be inserted and y - > already existed