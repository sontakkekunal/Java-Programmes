import java.io.*;
class FileMethods{
	public static void main(String [] args) throws IOException{
		File fobj1= new File("Incubator.txt");
		fobj1.createNewFile();
		
		//String getName()
		System.out.println(fobj1.getName());//return name of that file or directory //Incubator

		//String getParent()
		System.out.println(fobj1.getParent());//return parent directory name
						      //but here it will return null beacause it don't have any parent  directly created
		
		//String getPath()
		System.out.println(fobj1.getPath());//return path from current director
						    //here-> Incubator.txt  <--from current directory
		
		//String getAbsolutePath()
		System.out.println(fobj1.getAbsolutePath()); //return path from the root dircetor
							     //here-> /home/sontakke-kunal/Desktop/Java_class_Programme/Java_Class Programme/FileHandling/Incubator.txt						

		//boolean canRead()
		System.out.println(fobj1.canRead());//return boolean value based on the file is readable or not
						    //here-> true

		//boolean canWrite()
		System.out.println(fobj1.canWrite());//return boolean value based on the file is writeable or not
						     //here-> true

		//boolean isDirectory()
		System.out.println(fobj1.isDirectory());//return boolean value based on the object is folder or not folder
							//here-> false

		//boolean isFile()
		System.out.println(fobj1.isFile());//return boolean value based on the object is File or not file
						   //here-> true
	}
}

