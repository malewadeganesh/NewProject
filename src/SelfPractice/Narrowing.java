package SelfPractice;

public class Narrowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f=10.60f;
		int g=(int)f;          //Explicit casting or Narrowing casting
		float a=g;             // deta loss
		System.out.println(f);
		System.out.println(g);
		System.out.println(a);

	}

}
