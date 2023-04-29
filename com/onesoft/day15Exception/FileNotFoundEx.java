package com.onesoft.day15Exception;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundEx {
	public static void main(String[] args) {

		try {
			File f = new File("C:\\Users\\Suresh\\Documents\\sss.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
			while ((temp = fr.read()) != -1) {
				System.out.print(temp);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
