package com.coreJava;
import java.io.*;

public class WorkSpaceFiles {

	public static void main(String[] args) {
		try{
			FileOutputStream fout =new FileOutputStream("abc.txt");
			String s="I am a very good boy";
			
			byte b[] = s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("done");
			File f= new File("abc.txt");
			System.out.println(f.getAbsolutePath());
			
			FileInputStream fin =new FileInputStream(f);
			
			int i=0;
			
			 while((i=fin.read())!=-1){  
			     System.out.println((char)i);  
			    }  
		}
		catch (Exception e){
			System.out.println(e);
		}

	}

}
