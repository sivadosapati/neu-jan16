package lecture9;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileTest {

	public static void main(String[] args) throws Exception {
		File f = new File("/Users/dosapats/weka.txt");
		FileInputStream fis = new FileInputStream(f);
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			System.out.print((char)i);
		}
		fis.close();
	}

}
