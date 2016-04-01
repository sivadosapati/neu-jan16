package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountFileTest {

	public static int countFile(String file, String target) throws IOException{
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		int count = 0;
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			if(i == (int)target.charAt(0)){
				String temp = ""+(char) i;
				for(int j=1;j<target.length();j++){
					temp += (char)fis.read();
				}
				if(temp.equals(target)) count++;
			}
		}
		fis.close();
		return count;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(countFile("/Users/dosapats/weka.log","INFO"));
	}

}
