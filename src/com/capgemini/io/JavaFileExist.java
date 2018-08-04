//accept the complete path of a file from the user 
//and display whether the file exist or not

package com.capgemini.io;

import java.io.File;

public class JavaFileExist {

	public static void main(String[] args) {
		
		File f = new File("E:\\A.java");
		
		if(f.exists()){
			System.out.println("File Exists");
		}else{
			System.out.println("File does not exist");
		}

	}

}
