package stream;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("text4.txt");
		
		System.out.println(file.isFile()); // 파일인지 판단
		System.out.println(file.isDirectory()); // 폴더인지 판단
		System.out.println(file.getName());  // 파일 이름 가져오기
		System.out.println(file.getAbsolutePath());  // 파일경로 가져오기
		System.out.println(file.getPath()); // 생성자에 넣어준 정보
		System.out.println(file.canRead()); // 읽기 가능인지 판단
		System.out.println(file.canWrite()); // 쓰기 가능한지 판단
		System.out.println(file.length()); // 전체 파일의 크기(byte)
	}

}
