/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int j=0,n=0,i=0;
		String s,r="";
	    Scanner v=new Scanner(System.in);
		s=v.nextLine();
		for(char c: s.toCharArray()) 
		{
			n++;
		}
for(i=n-1;i>=0;i--){
	r=r+s.charAt(i);
}		
System.out.println(r);
	}
}
