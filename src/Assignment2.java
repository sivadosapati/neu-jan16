/**
 * Assignment for your lecture 2.
 * Please finish all the questions under 'Assignment'.
 * Please try the two questions under 'Bonus'.
 * Please write some tests as practice.
 * When you are writing tests, you should think about what situations might cause error? like 0,-1...
 * The deadline of this assignment is 01/27/2016 23:59.
 * Please feel free to contact me for any questions.
 * @author Yang
 */

public class Assignment2 {
	//Assignment
	/**
	 * Given an integer N as input, check the following:
	 * If N is odd, print "Weird".
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
	 * If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n){
		if(n%2==1){
	    	System.out.println("Weird");
	    }
		else{
			if(2<=n && n<=5) {
				System.out.println("Not Weird");
			}
			else if(6<=n && n<=20){
				System.out.println("Weird");
			}
			else if(n>20){
				System.out.println("Not Weird");
			}
		}
	}
	
	/**
	 * Input an array of scores and return the right grades based on following rules
	 * 90<=score    -->4
	 * 80<=score<90 -->3
	 * 70<=score<80 -->2
	 * 60<=score<70 -->1
	 * score<60     -->0
	 */
	public int[] checkGrade(int[] scores){
	    int[] grades = new int[scores.length];
	    for(int i=0;i<scores.length;i++){
	    	if(scores[i]>=90){  
	    		grades[i] = 4;
	    	}
	    	else if(scores[i]>=80 && scores[i]<90) {
	    		grades[i] = 3;
		    }
	    	else if(scores[i]>=70 && scores[i]<80){
	    		grades[i] = 2;
		    }
	    	else if(scores[i]>=60 && scores[i]<70){
	    		grades[i] = 1;
		    }
	    	else if(scores[i]<60){
	    		grades[i] = 0;
		    }
	    }
		return grades;
	}
	
	/**
	 * Write a method to determine whether a number is prime 
	 */
	public boolean isPrimeNumber(int n){
		if(n<2) return false;
	    for(int j=2;j*j<=n;j++){  
        	if(n%j==0){  
            	return false; 
            }
        }
	    return true;
	}
	
	/**
	 * Write a method to find all numbers(<=n) which are power of three.
	 */
	public int[] findPowerOfThree(int n){
		if(n<1) return null;
		int[] results = new int[n];
        results[0] = 1;
		for(int i=1;i<n;i++){
			results[i] = 3*results[i-1];
		}
		return results;
	}
	
	/**
	 * Count occurrences of a given letter in a given string.
	 */
	public int countLetter(String str,char c){
		if(str==null) return 0;
		int count = 0;
		for(int i=0;i<str.length();i++){
            if(c==str.charAt(i)){
            	count++;
            }
        }
		return count;
	}
	
	/**
	 * Find maximum and minimum in a given array, and return the max and min number
	 */
	public int[] findMinMax(int[] nums){
		if(nums==null||nums.length==0) return null;
		int[] res = new int[2];
		res[0] = nums[0];
		res[1] = nums[0];
        for(int i=1; i< nums.length; i++){
        	if(res[0] < nums[i]){
        		res[0] = nums[i];
        	}
        	if(res[1] > nums[i]){
        		res[1] = nums[i];
        	}
        }
		return res;
	}
	
	/**
	 * Find N fibonacci numbers
	 * Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1. 
	 */
	public int[] fibonacciNumber(int n){
		if(n<1) return null;
    	int [] res = new int[n];
    	for(int i=0; i<n; i++){
    		if(i<2) res[i] = 1;
    		else res[i] = res[i-1] +res[i-2];
    	}
    	return res;
	}
	
	//Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the result has only one digit.
	 * For example:
	 * Given n = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n){
		while(n>9){
			int temp = 0;
			while(n!=0){
				temp += n%10;
				n /= 10;
			}
			n = temp;
		}
		return n;
	}
	
	/**
	 * Write a program to check whether a given number is an ugly number.
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes another prime factor 7.
	 * Note that 1 is typically treated as an ugly number.
	 */
	public boolean isUgly(int n){
		if(n<4) return n>0;
        while(n%2==0) n=n/2;
        while(n%3==0) n=n/3;
        while(n%5==0) n=n/5;
        return n==1;
	}		
}
