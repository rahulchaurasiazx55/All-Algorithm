import java.lang.*;
import java.io.*;
import java.util.*;
class SelectionSort
{
	public static void main(String[] args)
	{
		int arr[]={4,1,5,2,6};
		int n=5;
		Sort(arr,n);
	}
	public static void Sort(int arr[],int n)
	{
		int min_index=0;
		for(int i=0;i<n;i++)
		{
			min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}