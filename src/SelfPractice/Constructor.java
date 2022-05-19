package SelfPractice;

public class Constructor {
	
	Constructor(int a,int b){
		int x= a+b+10;
		System.out.println(x);
	}
	Constructor(int x, int y , int z){
		int X= x+y+z+20;
		System.out.println(X);
	}

	public static void main(String[] args) {

		Constructor obj =new Constructor(1,2);
		Constructor obj1 =new Constructor(1,2,3);
	}

}
