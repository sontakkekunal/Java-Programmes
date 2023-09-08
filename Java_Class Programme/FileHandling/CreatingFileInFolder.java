import java.io.*;
class CreatingFileInFolder{
	public static void main(String [] args)throws IOException{
		File fobj= new File("FileHanding","Code1.txt");//will create file Code1.txt in the Folder FileHanding 
							       //internalyy--> new File(directory,file)
		fobj.createNewFile();
	}
}
//Runtime exception:- Exception in thread "main" java.io.IOException: No such file or directory
//here the dircetory is not present for creating file in the that folder
