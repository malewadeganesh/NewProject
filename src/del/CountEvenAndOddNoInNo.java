package del;

public class CountEvenAndOddNoInNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int evencount=0;
		int oddcount=0;
		while(num>0)
		{
			int temp=num%10;
			if(temp%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}
		System.out.println(evencount);
		System.out.println(oddcount);

	}}


