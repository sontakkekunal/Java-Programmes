import java.io.*;
class FileDemo{
        public static void main(String [] args)throws IOException{

                //FileWriter has 4 construvtor
		File f= new File("Incubator.txt");
		FileWriter fw= new FileWriter(f); //new FileWriter(File)
						  //same working as FileWriter(String)
                fw.write("Fluttor\n");
                fw.write("Backend\n");
                fw.write("Frontend\n");
                //write() method will write in sequencly

                //if we re-Execute this code then it rewrite on file with foramtting its first data,because by default append flag is false here 
		//in this FileWriter(File)
                fw.close();//will close the pipe for that fw object file
        }
}

