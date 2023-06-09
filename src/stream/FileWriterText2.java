package stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterText2 {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("text3.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write('A');
			
			char[] buf = {'B', 'C', 'D'};
			bw.write(buf);
			bw.write(buf, 1, 2);
			bw.write("홍길동 입니다");
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
