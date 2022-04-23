import java.lang.*;
import java.io.*;
import java.util.*;
class SelectionSort
{
    public static void main(String[] args)
    {
    	int arr[]={1,23,4,3,78,-1};
    	int n=6;
    	sort1(arr,n);
    }
    //Naive
    public static void sort(int arr[],int n)
    {
    	int temp[]=new int[n];
    	for(int i=0;i<n;i++)
    	{
    		int min_index=0;
    		for(int j=1;j<n;j++)
    		{
    			if(arr[j]<arr[min_index])
    			{
    				min_index=j;
    			}
    		}
    		temp[i]=arr[min_index];
    		arr[min_index]=Integer.MAX_VALUE;
    	}
    	for(int i=0;i<n;i++)
    	{
    		arr[i]=temp[i];
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr[i]+ " ");
    	}
    }
    //In-place method
    public static void sort1(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		int min_index=i;
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