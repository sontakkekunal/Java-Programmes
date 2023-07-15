import java.io.*;
class Demo{
	void getData() throws IOException{  //<-IOException for readLine is form thrown from readLine() to caller i.e. t getdata() and 
					    //<-- here getdata() throws Exeption to caller i.e. main
		System.out.println("Enter data");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int data =0;
		data =Integer.parseInt(br.readLine()); //<-readLine() throws IOException (Internally)
		                                       //<-If user enter string instead of number, the Exception occurs here during parseing
						       //<-The Exception is thrown to caller i.e. external Integer.parseInt(br.readLine()) 
						       //<-external Integer.parseInt(br.readLine()) throws Exception to its caller i.e. to getdata()
						       //<- getdata don't handle the Exeption so throws to its caller i.e. to main()
		System.out.println(data);
	}
	public static void main(String [] args) throws IOException{ //the received IOException form called function i.e. getdata() is throws to main's 
								    //caller i.e. to jvm , jvm handle it by Default Exception handler
		Demo obj = new Demo();
		obj.getData();
	}
}
//O/p->
//Enter data
//shashi
//Exception in thread "main" java.lang.NumberFormatException: For input string: "shashi"
//	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
//	at java.base/java.lang.Integer.parseInt(Integer.java:665)
//	at java.base/java.lang.Integer.parseInt(Integer.java:781)
//	at Demo.getData(NumberFormatException.java:8)
//	at Demo.main(NumberFormatException.java:15)


