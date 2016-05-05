package com.main;

public class SwapElements {

	public static void swapElementsInArray()
	{
		int[] array = {1,2,5,6,4};
		int temp = 0;
		for (int i=0;i<(array.length-1);i++)
		{
			if(array[i]>array[i+1])
			{
				temp = array[i+1];
				array[i+1]=array[i];
				array[i]=temp;
			}
		}
		
		for (int i=0;i<array.length;i++)
		{
			System.out.print("  "+array[i]);
		}
	}
	
	public static void main(String[] args) {
		swapElementsInArray();
	}
}
