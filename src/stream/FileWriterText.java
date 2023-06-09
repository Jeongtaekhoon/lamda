package stream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("text2.txt", true);
			fw.write('A');
			
			char[] buf = {'B', 'C', 'D'};
			fw.write(buf);
			fw.write(buf, 1, 2);
			fw.write("홍길동 입니다");
			
			fw.flush();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
