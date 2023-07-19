import java.util.Scanner;
class DataOverFlowException extends RuntimeException{ //User Define Exception
        DataOverFlowException(String msg){
                super(msg); //call to parent contructor i.e. RuntimeException contructor with passing arguments
        }
}
class DataUnderFlowException extends RuntimeException{
        DataUnderFlowException(String  msg){
                super(msg);
        }
}
class ArrayDemo{
        public static void main(String [] args){
                int arr[]=new int[5];
                Scanner sc =new Scanner(System.in);
                System.out.println("Enter integer value");
                System.out.println("Note: 0<element<100");
                for(int i=0; i<arr.length;i++){
                        int data=sc.nextInt();
			try{
                                if(data<0)
                                        throw new DataUnderFlowException("Mitra Data 0 peksha lahan ahee");
			       	//passing arguments in contructor with created obj
                                //Throwing UserDefineException
                                if(data>100)
                                        throw new DataOverFlowException("Mitra Data 100 peksha jast ahee");
                                arr[i]=data;
			}catch(DataOverFlowException | DataUnderFlowException obj){
				System.out.println("Exception");
				System.out.println(obj);
				obj.printStackTrace();
				obj.getMessage();
			}
                }
		System.out.println("Output");
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }
}

