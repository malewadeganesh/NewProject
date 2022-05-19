package SelfPractice;

public class VariablePractice {
	static int a=10;      // global variable > static variable
	int b=90;             // global variable > instance variable
	int add(){
		int x=80;         // local variable
		int y=90;         // local variable
		int z= x+y;        // local variable
		return z;
	}
	void voidmethod(){
		int w=80;         // local variable
		return;
	}
	
	public static void main(String [] args) {
    int c=55;            //global variable > instance variable 
    int d=40;            //global variable > instance variable
    System.out.println(c+d);

	}

}
