package com.fop.ApacheFOP;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
public class sample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String fileName = "srs/sample.txt";
        ClassLoader classLoader = new sample().getClass().getClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
         
        //File is found
        System.out.println("File Found : " + file.exists());
         
        //Read File Content
        String content = new String(Files.readAllBytes(file.toPath()));
        System.out.println(content);

	}

}
