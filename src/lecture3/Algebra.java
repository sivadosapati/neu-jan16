package lecture3;

import java.util.Scanner;

public class Algebra {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		String one = scanner.nextLine();
		System.out.println("Enter the next number");
		String two = scanner.nextLine();
		System.out.println("Enter the operation (sum, diff or multiply)");
		String op = scanner.nextLine();
		int oneInt = Integer.parseInt(one);
		int twoInt = Integer.parseInt(two);
		int result;
		//if( op == "sum"){
		if( op.equals("sum")){
			result = oneInt + twoInt;
			System.out.println(oneInt +" + "+twoInt+" = "+result);
		}
	}

}
