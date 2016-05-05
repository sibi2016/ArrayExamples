package com.main;

public class ArraySort {
	
	public static void sortArray()
	{
		int[] array ={2,6,5,9,2};
		for(int i=array.length;i>=0;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				if(array[j-1]>array[j])
				{
					int temp = array[j-1];
					array[j-1] = array[j];
					array[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted array");
		for (int x=0;x<array.length;x++)
		{
			System.out.print("  "+array[x]);
		}
		
	}
	
	public static void main(String[] args)
	{
		sortArray();
	}

}
