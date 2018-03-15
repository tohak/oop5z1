package com.konovalov;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main {

	public static void main(String[] args) {

		File folderOne = new File("folderA");
		folderOne.mkdirs();
		File folderTwo = new File("folderB");
		folderTwo.mkdirs();
		

		File fileOne = new File("./folderA/a.txt");
		try {
			fileOne.createNewFile();
		} catch (IOException e) {
			System.out.println("Error, dont create");
		}

		File fileTwo = new File("./folderA/b.doc");
		try {
			fileTwo.createNewFile();
		} catch (IOException e) {
			System.out.println("Error, dont create");
		}

		File fileThree = new File("./folderA/c.doc");
		try {
			fileThree.createNewFile();
		} catch (IOException e) {
			System.out.println("Error, dont create");
		}
		File fileFour = new File("./folderA/c.txt");
		try {
			fileFour.createNewFile();
		} catch (IOException e) {
			System.out.println("Error, dont create");
		}
		DocFileFilter dFF = new DocFileFilter("doc");

		File[] fileArray = folderOne.listFiles(dFF);
		for (File file : fileArray) {
			
			try {
				FileOperation.fileCopy(file, folderTwo);
			} catch (IOException e) {
				e.printStackTrace();				
			}
		}
		
	}
}
