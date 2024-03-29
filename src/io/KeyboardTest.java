package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KeyboardTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		Scanner scanner = null;

		try {
			File file = new File("phone.txt");
			if (file.exists() == false) {
				System.out.println("File Not Found");
				return;
			}

			System.out.println("=======파일정보========");
			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "bytes");
			System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));

			System.out.println("=======전화번호========");

			scanner = new Scanner(file);
			while (scanner.hasNextLine()) {
				String name = scanner.next();
				String phone1 = scanner.next();
				String phone2 = scanner.next();
				String phone3 = scanner.next();

				System.out.println(name + ":" + phone1 + "-" + phone2 + "-" + phone3);

			}

		} catch (IOException e) {
			System.out.println("error:" + e);
		} finally {
			if(scanner!=null) {
				scanner.close();
			}

		}
	}

}
