//DeSerization :- reading object from the file
import java.io.*;
class DeserzationDemo{
	public static void main(String [] args)throws IOException, ClassNotFoundException{
		FileInputStream fis= new FileInputStream("Objectfile.txt");//resprent the file 
									   //also throws FileNotFoundException 
									   //if FileNotFoundException is thrown at runtime also,then described file isnotprest
		ObjectInputStream ois= new ObjectInputStream(fis);// ObjectInputStream(InputStream) -> this constructor take InputStream and its child object
								  // only , as a FileInputStream child of InputStream is taken based on its functionlity
		Player obj1=(Player)ois.readObject();//here the return value of this method is on Object type so type caseting to player class
		Player obj2=(Player)ois.readObject();//also throws IOException
						     //also throws ClassNotFoundException
						     //
		fis.close();
		ois.close();
		System.out.println("jerno:  "+obj1.jerNo);
		System.out.println("name:  "+obj1.name);
		System.out.println("jerno:  "+obj2.jerNo);
		System.out.println("name:  "+obj2.name);

		}
}

