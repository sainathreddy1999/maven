package com.codebind;
import java.util.*;
public class Gift
{static int sum2;
public static void main(String args[])
{
	Chocolates g=new Chocolates();
	Sweets f=new Sweets();
	sum2=g.sum+f.sum1;
	System.out.println(sum2);
}
}
