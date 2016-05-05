package com.main;

public class MergeArrays {
	
	public static void mergeArray()
	{
		int[] array1 = {12,10,15,5,6};
		int[] array2 = {1,2,3};
		int length = array1.length + array2.length;
		int array3[] = new int[length] ;
		int count=0;
		
		for(int i = 0;i<array1.length;i++)
		{
			array3[i]=array1[i];
			count = count +1;
		}
		for(int i = 0;i<array2.length;i++)
		{
			array3[count]=array2[i];
			count = count +1;
		}
		for(int i=0;i<array3.length;i++)
		{
			System.out.print(" " +array3[i]);
		}
	}
	
	public static void main(String[] args) {
		mergeArray();
	}

}
