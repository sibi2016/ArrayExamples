package com.main;

public class CommonNumberInArrays {
	
	public static void commonNumber()
	{
		int[] array1 = {10,71,45,69,25};
		int[] array2 = {11,30,22,70,56};
		int counter=0;
		for (int i=0;i<array1.length;i++)
		{
			for (int j=0;j<array2.length;j++)
			{
				if(array1[i]==array2[j])
				{
					int commonNum = array1[i];
					System.out.println("Common number is "+commonNum);
					counter = counter + 1;
					
				}
			}
		}
		if (counter == 0)
		{
			System.out.println("No common number available.");
		}
	}
	
	public static void main(String[] args)
	{
		commonNumber();
	}

}
