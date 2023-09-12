import java.io.*;
class FileDemo{
        public static void main(String [] args)throws IOException{

                //FileWriter has 4 construvtor
                File f= new File("Incubator.txt");
                FileWriter fw= new FileWriter(f,false); //new FileWriter(File,boolean)
                                                  //same working as FileWriter(String,boolean)
                fw.write("Fluttor\n");
                fw.write("Backend\n");
                fw.write("Frontend\n");
                //write() method will write in sequencly

               
                fw.close();//will close the pipe for that fw object file
        }
}

