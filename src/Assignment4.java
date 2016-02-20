/**
 * Finish all the assignments. Try Bonus.
 * @author Yang
 */

public class Assignment4 {
	//Assignments
	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
	 * If the last word does not exist, return 0.
	 * Note: A word is defined as a character sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str){
		str = str.trim();
        return str.length()-1-str.lastIndexOf(" ");
	}
	
	/**
	 * Reverse a string by letters. Do not use 'split' function.
	 * e.g. "I like soccer" --> "reccos ekil I"
	 */
	public String reverseString1(String str){
		String res = "";
		for(char c : str.toCharArray()){
			res = c+res;
		}
		return res;
	}
	
	/**
	 * Reverse a string by words. Do not use 'split' function.
	 * e.g. "I like soccer" --> "soccer like I"
	 */
	public String reverseString2(String str){
		String res = "";
		for(int i=0;i<str.length();i++){
			String temp = "";
			while(i<str.length()&&str.charAt(i)!=' '){
				temp = temp+str.charAt(i++);
			}
			res = temp+" "+res;
		}
		return res.trim();
	}
	
	/**
	 * Count how many words in a string. Numbers are regarded as a word. Do not use 'split' function.
	 * e.g. "I like soccer" --> 3.    "I have 15 dollars" --> 4
	 */
	public int countWords(String str){
		int count = 0;
		str = str.trim();
		if(str.equals("")) return 0;
		boolean isWord = false;
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			if(Character.isLetter(c)||Character.isDigit(c)){
				isWord = true;
				continue;
			}
			else if(isWord){
				count++;
				isWord = false;
			}
		}
		return count+1;
	}
	
	/**
	 * Capitalize the first letters of words in a String. Do not use 'split' function.
	 * e.g. "I like soccer" --> "I Like Soccer".
	 */
	public String capitalizeLetters(String str){
		int dis = 'a'-'A';
		char letters[] = str.toCharArray();
		for(int i=0;i<letters.length;i++){
			if(Character.isLetter(letters[i])){
				if(letters[i]>'Z'){
					letters[i]-=dis;
				}
			}
			while(i<letters.length&&Character.isLetter(letters[i])) i++;
		}
		return new String(letters);
	}
	
	/**
	 * Use enum to represent the type of vehicles, like Bus, Motorcycle, Sedan, SUV, Truck...
	 */
	
	/**
	 * Define a vehicle class. Use suitable encapsulation. Use the enum you defined to represent the types.
	 * There is no standard answer for this question, but you need create necessary attributes for this class, and methods if needed.
	 */
	
	
	//Bonus
	/**
	 * Count and Say. Count each character.
	 * e.g. "aabacbaa" --> "5a2b1c"
	 */
	public String countAndSay(String str){
		int letters[] = new int[256];
		for(char c : str.toCharArray()){
			letters[c]++;
		}
		String res = "";
		for(char i=0;i<256;i++){
			if(letters[i]!=0){
				res+=letters[i]+""+i;
			}
		}
		return res;
	}
	
	/**
	 * Compare version number. If equal, return 0. if larger, return 1. if smaller, return -1.
	 * You could use library functions of Integer and String, like parseInt, split.
	 * e.g. "1.2.3" VS "1.2.0" --> 1.     "1.2" VS "1.2.0" --> 0.      "100.200" VS "200.100" --> -1.
	 */
	public int compareVersion(String version1, String version2){
		String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        for(int i=0;i<java.lang.Math.max(v1.length,v2.length);i++){
            if(i>v1.length-1){
                if(0<Integer.parseInt(v2[i])) return -1;
            }
            else if(i>v2.length-1){
                if(Integer.parseInt(v1[i])>0) return 1;
            }
            else if(Integer.parseInt(v1[i])>Integer.parseInt(v2[i])) return 1;
            else if(Integer.parseInt(v1[i])<Integer.parseInt(v2[i])) return -1;
        }
        return 0;
	}
}