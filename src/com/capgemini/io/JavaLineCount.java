//accept the complete path of a file from user and count the number of lines in 
//that file and print it on the console.

package com.capgemini.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class JavaLineCount {

	public static void main(String[] args) {
		try {
			// Taking file from user
			File f = new File("E:\\First Date.docx");
			if (f.exists()) {

				FileReader fr = new FileReader(f);
				LineNumberReader lnr = new LineNumberReader(fr);
				int lineNumber = 0;

				while (lnr.readLine() != null) {

					lineNumber++;

				}
				// printing number of lines in file.
				System.out.println("Number of Lines: " + lineNumber);
				lnr.close(); // closing object of LineNumberReader.

			} else {
				System.out.println("File does not exist.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

}
