import java.io.*;
import java.lang.RuntimeException;
import java.lang.NumberFormatException;
import java.lang.Exception;
class ExeptionDemo{
        public static void main(String [] args) throws IOException{
                BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter data ");
                String str=br.readLine();  //<- here anything entered is considered as String , so less Exception changes
                System.out.println(str);
                System.out.println("Enter data ");
                int data=0;
                try{
                        data =Integer.parseInt(br.readLine());  //String to integer can create Exception due to charcter entering
                }catch(NumberFormatException obj){ //Child parameter for next catch parameter
                        System.out.println("Please Enter integer data ");  //Can use nested try catch in catch block or recurson of that perticular 
                                                                           //stack frame by calling it again in catch
                        data=Integer.parseInt(br.readLine());
                }
		//The parameter of catches Block ,the most child class parameter of catch block must be first then its parent class parameter of catch
		//if parent parameter is first of child parameter then error
		//e.g.=>
		//catch(Child obj){
		//}
		//catch(Parent obj){
		//}
		catch(IllegalArgumentException obj){  // paramater is of catch is parametr of prevous catch parameter
			System.out.println("In catch block with para IllegalArgumentException");
			data=Integer.parseInt(br.readLine());
		}
		catch(RuntimeException obj){
                        System.out.println("In catch block with para RunTimeException");
                        data=Integer.parseInt(br.readLine());
                }
		catch(Exception obj){
                        System.out.println("In catch block with para Exception");
                        data=Integer.parseInt(br.readLine());
                }


                System.out.println(data);
        }
}

