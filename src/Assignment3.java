/**
 * Finish assignments, try bonus.
 * Deadline: Before the next class.
 * @author Yang
 */
public class Assignment3 {
	//assignments
	/**
	 * Return the sum of a gven array. You may assume the sum will not overflow.
	 */
	public int sumArray(int[] nums){
		
	}
	
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year
	 * Toddler : If the age is less than 3 and greater than 1
	 * Pre Schooler : If the age is less than 5 and greater than 3
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	class Person{
		int age;
		boolean gender;//false --> male, true --> female
		Person(int age, boolean gender){
			this.age = age;
			this.gender = gender;
		}
	}
	public void personType(Person person){
		
	}
	
	/**
	 * Given a sorted array, find whether there are duplicates in it.
	 */
	public boolean findDuplicates(int[] nums){
		
	}
	
	/**
	 * Given an array and a index, delete the number at that index in the array.
	 * You should return a new array which doesn't contain that number.
	 * For example, input {1,2,3,4,5}, index = 1, you should return {1,3,4,5}.
	 */
	public int[] deteleElement(int[] nums,int index){
		
	}
	
	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n){
		
	}
	
	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even, print n even numbers.
	 * For example, n = 3, print 1 3 5      n = 4, print 0 2 4 6
	 */
	public void printNumbers(int n){
		
	}
	
	
	
	
	//bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS"
	 * But the radiation from universe changed some characters of the massage.
	 * Write a method to count how many characters were changed.
	 * For example, "SOSSOSSOS" might be changed to "SOSSUSSOP", then your method should return 2.
	 * The message was consisted by "SOS" so its length will be multiple of 3.
	 * You could assume the message only contains upper letter.
	 */
	public int checkMessage(String message){
		
	}
}
