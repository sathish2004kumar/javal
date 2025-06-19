package Week4;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File2 {
	public static void main(String[] args) throws IOException{
		File f = new File("sample.txt");
		//f.setReadOnly();
		//System.out.println(f.getAbsolutePath());
		if(f.createNewFile()) {
			System.out.println("created");
		}
		else {
			System.out.println("already file created");
		}
		FileWriter fwrite = new FileWriter(f);
		fwrite.append("histroy of sinduroperation for india\nAll contruies support for sinduroperation");
		fwrite.close();
		Scanner sc = new Scanner(f);
		int c = 0;
		while(sc.hasNextLine()) {
			String word = sc.next();
			System.out.println(word);
			System.out.println(word.length());
			c+=word.length();
			}
	System.out.println(c);
		
		
	}

}
