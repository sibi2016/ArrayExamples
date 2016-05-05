package com.main;

public class LinearSearch {
	
	public static void linearSearch()
	{
		int[] array={10,11,12,13,14,15};
		int number = 9;
		int counter = 0;
		for (int i=0;i<array.length;i++)
		{
			if(array[i]==number)
			{
				System.out.println("The position of the number "+number+" is "+i+" in the array.");
				counter = counter+1;
			}
		}
		if (counter ==0)
		{
			System.out.println("No match for the number "+number+" in the array.");
		}
	}
	
	public static void main(String[] args)
	{
		linearSearch();
	}

}
