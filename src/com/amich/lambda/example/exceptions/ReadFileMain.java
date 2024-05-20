/**
 * 
 */
package com.amich.lambda.example.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Adolfo Miguel Iglesias Chaviano
 * 
 * Handling exception with Lambda
 */
public class ReadFileMain {

	public static void main(String[] args) {
		
		ReadFile readFile = getReadFileLambda();
		System.out.println("****  - Case 1 *****");
		invalidFilePath(readFile);
		
		System.out.println(System.lineSeparator());
		
		System.out.println("****  - Case 2 *****");
		validFilePath(readFile);
		
		System.out.println(System.lineSeparator());
		
		readFile = path -> {
			/*
			 * // invalid throwing exception because lambda body can throw IOException or
			 * subtype. Function Interface throw IOException
			 * 
			 * if(path == null || path.isEmpty()) { throw new Exception(); }
			 */

			File file = new File(path);
			if(file.exists()) {
				return file;
			}else {
				throw new FileNotFoundException("No file...");
			}
		};
		
		System.out.println("****  - Case 3 *****");
		invalidFilePath(readFile);
		
		
		
	}
	
	
	private static void invalidFilePath(ReadFile readFile) {
		String path = "/tmp/noFile.txt";

		try {
			File file = readFile.read(path);
			System.out.println("file found");
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No file found");
		}
	}
	
	private static void validFilePath(ReadFile readFile) {
		String path = "resources/file.txt";

		try {
			File file = readFile.read(path);
			System.out.println("file found");
			System.out.println(file.getAbsolutePath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No file found");
		}
	}
	
	private static ReadFile getReadFileLambda() {
		ReadFile readFile = path -> {
			/*
			 * // invalid throwing exception because lambda body can throw IOException or
			 * subtype. Function Interface throw IOException
			 * 
			 * if(path == null || path.isEmpty()) { throw new Exception(); }
			 */

			File file = new File(path);
			if(file.exists()) {
				return file;
			}else {
				throw new IOException();
			}
		};
		return readFile;
	}


}
