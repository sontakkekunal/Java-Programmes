import java.io.*;
class FileDemo{
	public static void main(String [] aef)throws IOException{
		File f= new File("Inductator.txt");
		f.createNewFile();  //internally throws IOException
		System.out.println("File created");
		//file is created after excution
	}
}
