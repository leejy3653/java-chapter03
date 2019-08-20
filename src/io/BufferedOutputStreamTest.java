package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null;
		try {

			// 기반 스트림(소스에 연결)
			FileOutputStream fos = new FileOutputStream("test.txt"); // 아래 BufferedOutputStream() 안에 삽입한다.

			// 보조 스트림(기반 스트림에 연결)
			bos = new BufferedOutputStream(fos); // 그럼 이 아래처럼 바뀐다.
			
			// bos = new BufferedOutputStream(new FileOutputStream("test.txt"));//앞으로는 위에 두줄 말고, 이렇게 사용할것!

			for (int i = 'a'; i <= 'z'; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
