import TurtleGraphics.KeyboardReader;
public class FractionMethod {

	public void ReadFraction()
	{
		KeyboardReader reader = new KeyboardReader();
		int numerator1, denominator1, numerator2, denominator2;
		
		System.out.print("Enter the numerator: ");
		numerator1=reader.readInt();
		
		System.out.print("Enter the denominator: ");
		denominator1=reader.readInt();
		
		System.out.println();
		System.out.print("Enter another numerator: ");
		numerator2=reader.readInt();
		System.out.print("Enter another denominator: ");
		denominator2=reader.readInt();
		
		AddFractions(numerator1, denominator1, numerator2, denominator2);
	}
	
	
	
	public void AddFractions(int n1, int d1, int n2, int d2)
	{
		int nn1=0, nn2=0,nd1=0, nd2=0;
		int numerator, denominator;
		if(d1!=d2)
		{
			nn1=n1*d2;
			nd1=d1*d2;
			nn2=n2*d1;
			
			
			numerator=nn1+nn2;
			denominator=nd1;
		}
		else
		{
			numerator=n1+n2;
			denominator=d1;
		}
		
		Reduce(numerator, denominator);
	}
	public void Reduce(int num, int den)
	{
		int num1, den1, count=0, countn=2, count1=0;
		num1=num;
		den1=den;
		while(num1>=0)
		{
			num1=num1-countn;
			count++;
		}
		num1=num1+countn;
		count=count-1;
		
		if(num1==0)
		{
			while(den1>=0)
			{
				den1=den1-countn;
				count1++;
			}
			den1=den1+countn;
			count1=count1-1;
		}
		
	}
}
