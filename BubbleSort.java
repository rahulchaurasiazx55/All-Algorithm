import java.lang.*;
import java.io.*;
import java.util.*;
class BubbleSort
{
	  public static void main(String[] args)
	  {
	  	int arr[]={3,4,1,5,2};
	  	int n=5;
	  	Sort(arr,n);
	  }
	  public static void Sort(int arr[],int n)
	  {
	  	   for(int i=0;i<n-1;i++)
	  	   {
	  	   	  for(int j=0;j<n-i-1;j++)
	  	   	  {
	  	   	  	if(arr[j]>arr[j+1])
	  	   	  	{
	  	   	  		 int temp=arr[j];
	  	   	  		 arr[j]=arr[j+1];
	  	   	  		 arr[j+1]=temp;
	  	   	  	}
	  	   	  }
	  	   }
	  	   for(int i=0;i<n;i++)
	  	   {
	  	   	System.out.print(arr[i]+" ");
	  	   }
	  }
}