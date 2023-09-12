import java.io.*;
class FileDemo{
        public static void main(String [] args)throws IOException{

                //FileWriter has 4 construvtor
                //                              filename      appendflag
                FileWriter fw= new FileWriter("Incubator.txt",true); //new FileWriter(String,Boolean)
								     //if append flag is true ,then write after prevoius data
								     //if append flag is false , then  re-write with formatting prvious data
                fw.write("Fluttor\n");
                fw.write("Backend\n");
                fw.write("Frontend\n");
                //write() method will write in sequencly

             
                fw.close();//will close the pipe for that fw object file
        }
}

