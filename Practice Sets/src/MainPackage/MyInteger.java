package MainPackage;
	
import java.util.Scanner;

public class MyInteger {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter an integer");
	int value = input.nextInt();
	System.out.print("The number " + value + " is even " + IsEven(value) + " is odd " + IsOdd(value) + " is prime " + IsPrime(value));
	}
	private int value;	
	
	public MyInteger (int value){
		this.value = value;
	}
	//Constructor
	
	public int getValue(){
		return this.value;
	}
	
	public boolean IsEven(){
		return (this.value % 2 == 0);
	}
	
	public boolean IsOdd(){
		return (this.value % 2 != 0);
	}
	
	public boolean IsPrime(){
		if(this.value == 2)
			return true;
		if(this.value == 9)
			return false;
		if (this.value % 2 == 0)
			return false;
		for (int i = 2; i < this.value; i++) {
			if (this.value % i != 0)
				return true; }
		return false;
	}
	
	public static boolean IsEven(int value){
		return (value % 2 == 0);
	} //this.value references class variable for that class, talking about instance vars
	
	public static boolean IsOdd(int value){
		return (value % 2 != 0);
	}
	
	public static boolean IsPrime(int value){
		if(value == 2)
			return true;
		if(value == 9)
			return false;
		if (value % 2 == 0)
			return false;
		for (int i = 2; i < value; i++) {
			if (value % i != 0) 
			return true; }
		return false;
	}
	
	public static boolean IsEven(MyInteger MyInt) {
		return (MyInt.value % 2 == 0);
	} 	
	
	public static boolean IsOdd(MyInteger MyInt) {
		return (MyInt.value % 2 != 0);
	}
	
	public static boolean IsPrime(MyInteger MyInt) {
		if(MyInt.value == 2)
			return true;
		if (MyInt.value == 9)
			return false;
		if (MyInt.value != 2 && MyInt.value % 2 == 0)
			return false;
		for (int i = 2; i < MyInt.value; i++){
			if (MyInt.value % i != 0);
				return true; }
		return false;
	}
	
	public static int equals(int value){
		int x = 3;
		return (x);
	}
	
	public static boolean equals(MyInteger MyInt) { 
		return (MyInt.value == 3); 
	}

	public static int arrayToint() {
		int[] list = {1, 2, 3, 4};
		return (1 + 2 + 3 + 4);
	}
	
	public static int stringToint() {
		String s = "1234";
		int i = Integer.parseInt(s);
		return(i);
	}
}
