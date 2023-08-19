//Properties
// -Used in serverside for repearedly change data
// -key value is always String & String <--Dramback
//
import java.io.*;
import java.util.*;
class PropertiesDemo{
	public static void main(String [] args)throws IOException{
		Properties obj = new Properties();
		//first create .properties file with key and value pair
		//in that file we acn directly give key value as key=value

		FileInputStream fobj= new FileInputStream("friends.properties");//take input as file from specific path
		System.out.println(obj);
		obj.load(fobj);//add file to properties object
			       //internaly -> load(FileInputStream)throws IOException, it throws IOException
				//methods in Properties class throws IOException
		String name =obj.getProperty("Ashish");
		//gets value of passed key from Properties object 

		System.out.println(name);

		obj.setProperty("Shashi","Biencaps");//add entry to Properties object 
		System.out.println(obj);

		FileOutputStream outobj= new FileOutputStream("friends.properties");//class for providing output to the given specific path file
		obj.store(outobj,"Updated by Shashi");//this method update the file by using object of FileInputStream objects which has path
						      //of specific file
						      //and passed string is for passing message or info of update
						      //in file along with passed string the time and date is also updated as headerfile in file
		obj.setProperty("Kunal","Kunal's Team");
		System.out.println(obj.getProperty("Kunal"));

		obj.store(outobj,"Updated by Kunal");//if passed string changes , then newly all entryes are created by that header file


	}
}

