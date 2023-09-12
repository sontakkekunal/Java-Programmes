//Serialzation:- Writing object in file
import java.io.*;
class Player implements Serializable{//marker interface
	int jerNo=0;
	String name;
	Player(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}
}
class SerialzationDemo{
	public static void main(String [] args)throws IOException{
		Player obj1=new Player(18,"Virat");
		Player obj2=new Player(45,"Rohit");
		FileOutputStream fos= new FileOutputStream("Objectfile.txt");//object of FileOutputStream represnt the file
		ObjectOutputStream oos= new ObjectOutputStream(fos);//ObjectOutputStream(OutputStream) -> the constructor can take OutputStream and its child
								    //as parameter in this, as a child of OutputStream the FileOutputStream is selected by
								    //its functionality
								    //oos is like inner pipe in the fos pipe for writing
		oos.writeObject(obj1);//passed object's class must be of Seraizable for writing object in the file
		oos.writeObject(obj2);
	}
}
