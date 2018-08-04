//accept the complete path of a file from user and count the number of words in 
//that file and print it on the console.

package com.capgemini.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class JavaWordCount {

	public static void main(String[] args) {
		try {
			// Taking file from user
			File f = new File("E:\\First Date.docx");
			if (f.exists()) {

				FileReader fr = new FileReader(f);
				LineNumberReader lnr = new LineNumberReader(fr);
				String line;
				int countWord = 0;
				while ((line = lnr.readLine()) != null) {

					String[] wordlist = line.split(" "); // splitting line.
					countWord += wordlist.length;

				}
				// printing number of words in file.
				System.out.println("Number of words: " + countWord);
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
