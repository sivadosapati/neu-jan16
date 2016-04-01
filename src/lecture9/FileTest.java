package lecture9;

import java.io.File;

public class FileTest {
	public static void main(String args[]) throws Exception{
		File f = new File("/Users/dosapats/wek.log");
		f.delete();
		System.out.println("Exists -> "+f.exists());
		System.out.println("Can Read -> "+f.canRead());
		System.out.println("Absolute Path -> "+f.getAbsolutePath());
		System.out.println("Last Modified -> "+new java.util.Date(f.lastModified()));
		System.out.println("Is Directory -> "+f.isDirectory());
		System.out.println("Length -> "+f.length());
		f.createNewFile();
	}
}
