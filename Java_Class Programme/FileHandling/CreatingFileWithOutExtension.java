import java.io.*;
class CreatingFileWithOutExtension{
	public static void main(String [] args) throws IOException{
		File fobj= new File("C2w");
		System.out.println(fobj.exists());
		fobj.createNewFile();//passed parameter to fobj object without name and using createNewFile() method will create create .txt file of that
				     //passed parameter as name 
		System.out.println(fobj.exists());
	}
}

