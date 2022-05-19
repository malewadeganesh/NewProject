package del;

import java.util.Scanner;

public class OddOrEvenInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,sum;
		sum=0;
		System.out.println("Enter Range");
		try (Scanner s = new Scanner(System.in)) {
			n=s.nextInt();
		}
		if((n%2)==0)
		{
		for(i=0;i<=n;i=i+2)	
		{
		sum=sum +i;	
		}
		System.out.println("Sum of even no upto "+n+" is "+sum);	
		}
		else
		{
		for(i=1;i<=n;i=i+2)	
		{
		sum=sum +i;				
		}
	   System.out.println("Sum of odd no upto "+n+" is "+sum);
		}
	}

}
