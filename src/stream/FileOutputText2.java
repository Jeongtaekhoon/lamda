package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputText2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fo = new FileOutputStream("text.txt", true); // true는 기존내용에 이어서 쓴다
			byte[] b = new byte[26];
			byte data = 65;
			for(int i = 0; i < b.length; i++) {
				b[i] = data;
				data++;
			}
			fo.write(b);
		}catch (FileNotFoundException e) {
				e.printStackTrace();
		}catch (IOException e) {
				e.printStackTrace();
	} 
	}

}

