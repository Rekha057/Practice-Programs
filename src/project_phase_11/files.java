package project_phase_11;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class files{
public static void main(String[] args) throws IOException {
 File myFile = new File("a.txt");
 if (myFile.createNewFile()) {
 System.out.println("file created successfully");}
 else {System.out.println("file not created" );}
     String dat= "hello";
     FileWriter op=new FileWriter("a.txt");
    op.write(dat);
    System.out.println("data is written ");
    op.close();
 char[] data=new char[100];
	FileReader input =new FileReader("a.txt");
	input.read(data);
	System.out.println("data received from the file" );
	System.out.println(data);
	input.close();

   String dataa=" this data is appended.";
	FileWriter output =new FileWriter("a.txt",true);
	output.write(dataa);
	System.out.println("file appended");
	output.close();
  }
}



