import java.lang.*;
import java.io.*;
import java.util.*;
class MergeSort
{
	public static void main(String[] args)
	{
		int arr[]={6,3,2,1,5,7,0,4};
		int low=0;
		int high=arr.length-1;
		mergesort(arr,low,high);
		print(arr);
	}
	public static void merge(int arr[],int l,int m,int h)
	{
		int n1=m-l+1;
		int n2=h-m;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++)
		{
			left[i]=arr[i+l];
		}
		for(int j=0;j<n2;j++)
		{
			right[j]=arr[m+1+j];
		}
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2)
		{
			if(left[i]<=right[j])
			{
				arr[k++]=left[i++];
			}
			else{
				arr[k++]=right[j++];
			}
		}
		while(i<n1)
		{
			arr[k++]=left[i++];
		}
		while(j<n2)
		{
			arr[k++]=right[j++];
		}

	}
	public static void mergesort(int arr[],int l,int r)
	{
		if(r>l)
		{
			int mid=l+(r-l)/2;
			mergesort(arr,l,mid);
			mergesort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	public static void print(int arr[]){
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}