/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Demo
{
	static int i;
	public static void main (String[] args) throws java.lang.Exception
	{
for(i=1;i<=100;i++)
		{  
//returns true if both the conditions return true  
if (i%3==0 && i%5==0)   
{   
//prints if the number is multiple of 3 and 5  
System.out.println("FizzBuzz");  
}   
//executes if the condition returns true  
else if (i%3==0)   
{  
//prints if the number is multiple of 3  
System.out.println("Fizz");  
}   
//executes if the condition returns true  
else if (i%5==0)   
{   
//prints if the number is multiple of 5  
System.out.println("Buzz");  
}   
else
{  
//prints the number itself if the number is not divisible by both 3 and 5     
System.out.println(i);  
}  
}
}
}
