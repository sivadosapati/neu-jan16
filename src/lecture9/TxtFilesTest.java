package lecture9;

import java.io.File;

public class TxtFilesTest {

	public static void main(String[] args) {
		File directory = new File("/Users/dosapats");
		File files[] = directory.listFiles();
		int count = 0;
		for (File file : files) {
			String name = file.getAbsolutePath();
			if(name.endsWith(".txt")){
				count++;
				System.out.println(name);
			}
		}
		System.out.println("Text files count -> "+count);

	}

}
