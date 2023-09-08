import java.io.*;
class CreatingFileInFolder{
        public static void main(String [] args)throws IOException{
		File fobj1 = new File("FileHanding");
		fobj1.mkdir();//we will create first folder for creating it
                File fobj2= new File(fobj1,"Code1.txt");//will create file Code1.txt in the Folder FileHanding 
                                                               //internalyy--> new File(directory,file)
                fobj2.createNewFile();
        }
}

