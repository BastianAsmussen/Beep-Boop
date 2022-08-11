package tech.asmussen.lang;

import java.io.*;

public class BeepBoop {
	
	public static void main(String[] args) throws IOException {
		
		File file;
		
		if (args.length == 0) {
			
			throw new IllegalArgumentException("Usage: java -jar BeepBoop.jar /path/to/file.bb!");
			
		} else {
			
			file = new File(args[0]);
			
			if (!file.getName().endsWith(".bb")) {
				
				throw new IllegalArgumentException("File must be a .bb file!");
			}
		}
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		String line;
		
		while ((line = reader.readLine()) != null) {
			
			if (!line.equals(""))
				
				System.out.println(line);
		}
	}
}
