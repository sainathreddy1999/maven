package com.codebind;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sweets extends Gift {
static int sum1=0;
Sweets()
	{
	HashMap<Integer,String> h1=new HashMap();
	int arr[]=new int[20];
	String s[]=new String[20];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter weights of 8 chocolates:");
	for(int i=0;i<=8;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter Names of sweets:");
	for(int i=0;i<=8;i++)
	{
		s[i]=sc.next();
	}
	Map<Integer,String> h=new HashMap<Integer,String>();
	h.put(arr[0],s[0]);
	h.put(arr[1],s[1]);
	h.put(arr[2],s[2]);
	h.put(arr[3],s[3]);
	h.put(arr[4],s[4]);
	h.put(arr[5],s[5]);
	h.put(arr[6],s[6]);
	h.put(arr[7],s[7]);
	h.put(arr[8],s[8]);
	for(int i=0;i<=8;i++)
    {
    sum1=sum1+arr[i];
    	if(arr[i]>arr[i+1])
    	{
    		int temp;
    		String t;
    		temp=arr[i];
    		arr[i]=arr[i+1];
    		arr[i+1]=temp;
    		t=s[i];
    		s[i]=s[i+1];
    		s[i+1]=t;
    	}
    	
    	
    }
    System.out.println(sum1);
	 
	for(int i=0;i<=8;i++)
		System.out.println(arr[i]+"\t"+s[i]);
/*public static void main(String args[])
{
	Sweets a=new Sweets();
	Sweets b=new Sweets();
	Sweets c=new Sweets();
	Sweets d=new Sweets();
	Sweets e=new Sweets();
}*/
}
}
