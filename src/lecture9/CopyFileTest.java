package lecture9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileTest {

	public static void main(String[] args) throws Exception {
		File f = new File("/Users/dosapats/weka.log");
		File o = new File("/Users/dosapats/weka.txt");
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(o);
		String firstLine = "I'm copying..\n";
		fos.write(firstLine.getBytes());
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			System.out.print((char)i);
			fos.write(i);
		}
		String lastLine = "\nI'm done copying\n";
		fos.write(lastLine.getBytes());
		fis.close();
		fos.close();
	}

}
