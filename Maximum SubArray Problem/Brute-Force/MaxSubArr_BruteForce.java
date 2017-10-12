//This program is a Brute-Force solution to maximum subarray problem.
import java.io.*;
import java.util.*;

class MaxSubArr_BruteForce
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	
		System.out.print("Please enter the total number of elements in the list: ");
		int[] arr = new int	[input.nextInt()];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter Element no. " + (i+1) + ": ");
            		arr[i] = input.nextInt();
		}
		
		msa_bf(arr);
		//System.out.println("Maximum contiguous sum is " + msa_bf(arr));
	}
	
	static void msa_bf(int a[])
	{
		int size = a.length;
		int count = Integer.MIN_VALUE;
		int left = 0;
		int right = a.length - 1;
		
		int i = 0;
		while(i != size)
		{
			int temp_count = 0;
			int j = i;
			while(j != size)
			{
				temp_count = temp_count + a[j];
				if(temp_count > count)
				{
					count = temp_count;
					left = i;
					right = j;
				}
				j++;
			}
			i++;
		}
		System.out.println("Left Index: " + left);			
		System.out.println("Right Index: " + right);
		System.out.println("Maximum contiguous sum is : " + count);
	}
}
