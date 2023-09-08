import java.io.*;
class FolderCreation{
	public static void main(String [] rgs){
		File fobj = new File("Filehandling");
		System.out.println(fobj.exists());
		fobj.mkdir();//create new folder
		System.out.println(fobj.exists());
	}
}
