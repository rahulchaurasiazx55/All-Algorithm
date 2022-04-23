import java.lang.*;
import java.io.*;
import java.util.*;
class InsertionSort
{
   public static void main(String[] args)
   {
   	  int arr[]={8,7,6,5,4,3,2,1};
   	  int n=8;
   	  sort(arr,n);
   }
   public static void sort(int arr[],int n)
   {
   	   for(int i=1;i<n;i++)
   	   {
   	   	  int key=arr[i];
   	   	  int j=i-1;
   	   	  while(j>=0 && arr[j]>key)
   	   	  {
   	   	  	arr[j+1]=arr[j];
   	   	  	j--;
   	   	  }
   	   	  arr[j+1]=key;
   	   }
   	   for(int i=0;i<n;i++)
   	   {
   	   	System.out.print(arr[i]+" ");
   	   }
   }
}