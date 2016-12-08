package com.main;

public class LargestNum {
	
	public static void findLargestNum()
	{
		int[] numList = {12,23,56,89,100};
		for (int i=0;i<numList.length;i++)
		{
			System.out.print(numList[i]+" ");
		}
		
		int largeNum = numList[0];
		for (int j=1;j<numList.length;j++)
		{
			if (numList[j]>largeNum)
			{
				largeNum = numList[j];
			}
						
		}
		System.out.println("Largest Number is "+largeNum);
		
	}
	
	public static void main(String[] args) {
		findLargestNum();
		
	}

}
