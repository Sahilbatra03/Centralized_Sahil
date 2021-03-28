package pkg1;

public class Doubleloop {
	
	public void firstPattern()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void secondPattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=5;j-i>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public void thirdPattern()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	
	public void fourthPattern()
	{
		int k=0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
			k=k+1;
				System.out.print(k);
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	
	public void fifthPattern()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i-1;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
			System.out.print("*");	
			}
			System.out.println();
		}
		
	}
	
	public void sixthPattern()
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i-1;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i*2-1;k++)
			{
			System.out.print("*");	
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Doubleloop dbl =  new Doubleloop();
		dbl.firstPattern();
		dbl.secondPattern();
		dbl.thirdPattern();
		dbl.fourthPattern();
		dbl.fifthPattern();
		dbl.sixthPattern();

	}

}
