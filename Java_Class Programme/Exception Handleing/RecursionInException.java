import java.util.*;
import java.io.*;
class RecursionInException{
	int x=0;
	float y=0;
	double z=0;
	String name="";
	void takeInput()throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		try{
			System.out.println("Enter integer x: ");
			//x=sc.nextInt();
			x=Integer.parseInt(br.readLine());
			System.out.println("Enter float y: ");
			//y=sc.nextFloat();
			y=Float.parseFloat(br.readLine());
			System.out.println("Enter double z: ");
			//z=sc.nextDouble();
			z=Double.parseDouble(br.readLine());
			//sc.nextLine();
        	        System.out.println("Enter String name: ");
	                //name=sc.nextLine();
			name=br.readLine();

		}
		catch(InputMismatchException | NumberFormatException obj){
			System.out.println(obj);
			obj.printStackTrace();
			System.out.println("Please enter valid Input");
			takeInput();
		}
	}
	public static void main(String [] args)throws IOException{
		RecursionInException obj = new RecursionInException();
		obj.takeInput();
	}
}
