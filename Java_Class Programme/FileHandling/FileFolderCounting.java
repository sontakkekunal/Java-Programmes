import java.io.*;
class FileFolderCounting{
	public static void main(String [] args){
		int count1=0;
		int count2=0;
		File fobj= new File("/home/sontakke-kunal/Desktop/Java_class_Programme/Java_Class Programme/FileHandling");//represnting directory
		
		System.out.println(fobj.exists());

		String[] files=fobj.list();//for object of diectory, list() methods will return string array of all file & folder present in itself

		for(String str: files){
			File f= new File(str);   //here 'f' object represnt the file or folder in current directory by passed name
						 //we cannot use isFile or isDictory method method on str directory because string don't have that method
			if(f.isFile())
				count1++;
			if(f.isDirectory())
				count2++;
		}
		System.out.println("No. of files: "+count1);
		System.out.println("No. of folder: "+count2);
	}
}
