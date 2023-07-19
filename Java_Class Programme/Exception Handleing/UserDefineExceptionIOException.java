import java.util.Scanner;
import java.io.IOException;
class DataOverFlowException extends IOException{ //User Define Exception
        DataOverFlowException(String msg){
                super(msg); //call to parent contructor i.e. IOException contructor with passing arguments
        }
}
class DataUnderFlowException extends IOException{
        DataUnderFlowException(String  msg){
                super(msg);
        }
}
class ArrayDemo{
        public static void main(String [] args) throws DataUnderFlowException,DataOverFlowException{
                int arr[]=new int[5];
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter integer value");
                System.out.println("Note: 0<element<100");
                for(int i=0; i<arr.length;i++){
                        int data=sc.nextInt();
                        if(data<0)
                                throw new DataUnderFlowException("Mitra Data 0 peksha lahan ahee"); 
			                                                                         //passing arguments in contructor with created obj
                                                                                                    //Throwing UserDefineException
												    //This Exception must be handled at compile time
                        if(data>100)
                                throw new DataOverFlowException("Mitra Data 100 peksha jast ahee");
                        arr[i]=data;
                }
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }
}

