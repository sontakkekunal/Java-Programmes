import java.io.*;
class FileDemo{
	public static void main(String [] args)throws IOException{

		//FileWriter class checks if the passed constructor value file name i.e. that file is present or not ,
		//if not then it will make that file,that why, its constructoor throws IOException
		//Only in FileWriter class and its parent class this situation is checked(i.e. in Writing stream)
		FileWriter fw= new FileWriter("Incubator.txt");//will check if Incubator.txt is present or not,if not ,then creates that file ,
							       //that why, its constructoor throws IOException
		
		fw.write("Fluttor\n");
		fw.write("Backend\n");
		fw.write("Frontend\n");
		//write() method will write in sequencly
		
		//if we re-Execute this code then it rewrite on file with foramtting its first data,because by default append flag is false here
		////in this FileWriter(String)
		fw.close();//will close the pipe for that fw object file
	}
}
