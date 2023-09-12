//Object of File (new File())(f) actually pointes towards the FileDescripter
//and FileDescripter pointes towards real file
//FileDescripter has the unique no. of  file
import java.io.*;
class FileDescripterDemo{
	public static void main(String [] args)throws FileNotFoundException,IOException{
		FileInputStream fls = new FileInputStream("Incubator.txt");
		FileDescriptor fd= fls.getFD();//returns FileDescripter object
					       //throws IOException
		System.out.println(fd);
	}
}
