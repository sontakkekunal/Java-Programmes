//if file is empty , then letter is -1 in file
//end of file has -1 letter
import java.io.*;
class FileReaderDemo{
	//here both IOException and FileNotFoundException is thrown , but IOException is parent of FileNotFound exception so we file direcetly throws Parent
	public static void main(String [] args)throws IOException{
		FileReader fr= new FileReader("Incubator.txt");
		//FileReader() constructor throws FileNotFoundException internally ,becuase file is present or not it does not  knows
		int data= fr.read(); //internnlly throws IOException
		while(data!=-1){  //-1 in file represent end of the file
			System.out.print((char)data);
			data=fr.read();
			/*
			if((char)data=='\n')
				System.out.println();
			*///for double space  between
		}
		fr.close();  //throws IOException
	}
}

