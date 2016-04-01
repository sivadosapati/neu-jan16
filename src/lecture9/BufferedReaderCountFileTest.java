package lecture9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderCountFileTest {

	public static int countFileUsingBufferedReader(String file, String target)
			throws Exception {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr, 8192 * 4);
		int count = 0;
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			count = count + findCount(line, target);
		}
		br.close();
		isr.close();
		fis.close();
		return count;
	}

	private static int findCount(String line, String target) {
		String words[] = line.split(" ");
		int count = 0;
		for (String word : words) {
			if (word.contains(target))
				count++;
		}
		return count;
	}

	public static int countFile(String file, String target) throws IOException {
		File f = new File(file);
		FileInputStream fis = new FileInputStream(f);
		int count = 0;
		while (true) {
			int i = fis.read();
			if (i == -1) {
				break;
			}
			if (i == (int) target.charAt(0)) {
				String temp = "" + (char) i;
				for (int j = 1; j < target.length(); j++) {
					temp += (char) fis.read();
				}
				if (temp.equals(target))
					count++;
			}
		}
		fis.close();
		return count;
	}

	public static void main(String[] args) throws Exception {
		long start = System.nanoTime();
		int count = countFile("/Users/dosapats/weka.log", "INFO");
		long end = System.nanoTime();
		System.out.println((end - start) + " -> " + count);
		start = System.nanoTime();
		count = countFileUsingBufferedReader("/Users/dosapats/weka.log", "INFO");
		end = System.nanoTime();
		System.out.println((end - start) + " -> " + count);
	}

}
