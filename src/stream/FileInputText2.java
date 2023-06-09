package stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputText2 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("src/stream/FileInputText.java");
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data = fis.read(buf)) != -1) {
				System.out.print(new String(buf, 0, data));
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
	}

}
}
