package method;

import java.util.Scanner;

public class MethodInSameClass {
	public static double add(double a, double b)
	{double c;
	c=a+b;
	System.out.println("A" +" + " +"B = " +c);
	return c;}
	public static double sub(double a, double b)
	{double c;
	c=a-b;
	System.out.println("A" +" - " +"B = " +c);
	return c;}
	public static double mul(double a, double b)
	{double c;
	c=a*b;
	System.out.println("A" +" * " +"B = " +c);
	return c;}
	public static double div(double a, double b)
	{double c;
	c=a/b;
	System.out.println("A" +" / " +"B = " +c);
	return c;}

	public static void main(String[] args) {
		
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.print("Enter A= ");
			double a= s.nextInt();
			try (Scanner sc = new Scanner(System.in)) {
				System.out.print("Enter B= ");
				double b= sc.nextInt();
				try (Scanner sca = new Scanner(System.in)) {
					System.out.println("Which operation do you want to  perform "
							+ "add=1,sub=2,mul=3,div=4:  " );
					double c=  sca.nextInt();
					
					 
					if (c== 1)
					{add(a,b);}
					if(c==2)
					{sub( a, b);}
					if(c==3)
					{mul( a, b);}
					if(c==4)
					{div( a, b);}
				}
			}
		}
	}
}
