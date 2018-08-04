//Write the java version of grep. The user will input from the command line the search string and 
//file name. The output of the program will be line numbers and the lines in which the string occurs.

package com.capgemini.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.Scanner;

public class TestGrep {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the path of file");
		String str = scanner.nextLine();
		try {
			// Taking File
			File f = new File(str);
			if (f.exists()) {

				FileReader fr = new FileReader(f);
				LineNumberReader lnr = new LineNumberReader(fr);

				String line;
				int lineNumber = 0;
				int flag=0;
				System.out.println("Enter the word you want to search");

				String find = scanner.nextLine();

				// Logic
				while ((line = lnr.readLine()) != null) {
					lineNumber++;
                    if(line.contains(find)) {
                    	flag=1;
                    	System.out.println("Word is found at Line Number: "+lineNumber+" Line: "+line);
                    }
					
				}
				if(flag!=1) {
					System.out.println("Word Not found");
				}

			} else {
				System.out.println("File Not Found");
			}

		} catch (IOException io) {
			io.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
