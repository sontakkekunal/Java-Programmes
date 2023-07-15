import java.io.*;
import java.lang.NumberFormatException;
class Demo{
        void getData() throws IOException{  //<-IOException for readLine is form thrown from readLine() to caller i.e. t getdata() and 
                                            //<-- here getdata() throws Exeption to caller i.e. main
                System.out.println("Enter data");
                BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
                int data =0;
		try{
                        data =Integer.parseInt(br.readLine());
		} //<--Exeption is oocurd in this block , and passed to catch block
                catch(NumberFormatException obj){  //catch block catches the Exception and store Exception statement in obj (Actual Exception)
						   //Exception statement contains Thread Name,Exception name,Describtion,Srack Trace
			System.out.println("Please enter valid data"); //<-- User define output for exception
			System.out.println(obj); //<-- Printing Exception statement  only(Actual Exception)
		        obj.printStackTrace(); //<-- printStackTrace() method get its stack trace ,where Exception is occued till its handling
					       //<-- Exception statement as well as stack Trace is Printed
		}
                System.out.println(data); //<-- if Exception oocurs then value of data remain unchanged
        }
        public static void main(String [] args) throws IOException{ //the received IOException form called function i.e. getdata() is throws to main's 
                                                                    //caller i.e. to jvm , jvm handle it by Default Exception handler
                Demo obj = new Demo();
                obj.getData();
        }
}

