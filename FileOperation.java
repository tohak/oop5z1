package com.konovalov;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOperation {

	public static void fileCopy(File in, File out) throws IOException {
		byte[] buffer = new byte[1024 * 1024];
		int readByte = 0;
		String file=in.getName();
		File outNew=new File(out,file);
		try (FileInputStream fis = new FileInputStream(in); FileOutputStream fos = new FileOutputStream(outNew)) {
			for (; (readByte = fis.read(buffer)) > 0;) {
				fos.write(buffer, 0, readByte);
			}

		} catch (IOException e) {
			throw e;
		}
	}

}
