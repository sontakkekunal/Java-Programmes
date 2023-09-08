//File class present in the io package
import java.io.*;
class FileCreation{
	public static void main(String [] args)throws IOException{
		File fobj = new File("Core2Web.txt"); //actually this doesn't create file
						     //in this statement fobj resprent the file,while passed paramter will be name of the file
		System.out.println(fobj.exists());//return true or false value based on the file exists or not
		fobj.createNewFile();//this funcion will create new file
				     //but internally throws IOException
		System.out.println(fobj.exists());
	}
}
