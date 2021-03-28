package pkg1;

public class SingleLoop {
	
	
	public void swapNumbersUT(int a , int b)
	{
		int c;
		
		c=b;
		b=a;
		a=c;
		System.out.println("Value of A after swap is "+a);
		System.out.println("Value of B after swap is "+b);
		
	}
	
	public void swapNumbersWUT(int a , int b)
	{
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("Value of A after swap is "+a);
		System.out.println("Value of B after swap is "+b);
		
	}
	
	
	public void primeNumbers(int a)
	{
		int count =0;
		if(a==1 || a==2)
		{
			
			System.out.println(a+" is prime number");
		}else if(a<0)
		{
			System.out.println("Please enter a positive number");
		}
		else {
		for(int i =2; i<a/2;i++)
			
		{
			if(a%i==0)
			{
				count++;
				System.out.println(a +"is not a prime number");
				break;
			}
		}			
		if(count ==0)
		{
			System.out.println("Entred number is prime number");
		}
		}
		}
	
	public void palindromenumber(int a)
	{
		int org_num =a;
		int sum =0;
		while (a>0)
		{
			
			int x = a%10;
			a= a/10;
			sum = sum*10 + x;
			System.out.println(sum);
			
			
		}
		if (sum ==org_num)
		{
			System.out.println("Number is palindrome");
		
		}else
		{
			System.out.println("Not a palindrome number");
		}
		
	}
	
	public void tablePrint(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(a*i);
		}
		
	}
	
	public void checkArmstrong(int a)
	{
		int org_num = a;
		int sum =0;
		int x=0;
		if(a<=0)
		{
			System.out.println("Enter positive number");
		}else
		{
			while (a%10 >0)
			{
			 x= a%10;
			 a=a/10;
				sum= sum + (x*x*x);
				System.out.println(sum);
			}
			
			if(sum!=org_num)
			{
				System.out.println("Entered number is not an Armstrong number");
			}else
			{
				System.out.println("Entered number is  an Armstrong number");
			}
		}
		
		
	}
	
	public void factorialPrint(int a)
	{
		int factorial =1;
		for(int i=a;i>0;i--)
		{
			factorial = factorial*i;
		}
	System.out.println("Factorial of number is"+factorial);
	}
	
	public void fibonacciPrint()
	{
		
		int a =0;
		int b=1;
		int sum =0;
		for(int i=1;i<=12;i++)
		{
			System.out.println(a);
			
		sum = a+b;
		a=b;
		b=sum;
		
		}
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
SingleLoop sngl = new SingleLoop();
sngl.tablePrint(32);
		
	}

}
