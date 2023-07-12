import java.io.*;
class RomanToDecimal1_1{
	static int  romanToDecimal(String str){
		str=str.toUpperCase();
		int total=0;
		for(int i=0;i<str.length();i++){
			int first=0;
                        int second=0;	
                        if(str.charAt(i)=='I')
		      		first=1;
      		      	else if(str.charAt(i)=='V')
            			first=5;
		      	else if(str.charAt(i)=='X')
                                first=10;
		      	else if(str.charAt(i)=='L')
                                first=50;
       			else if(str.charAt(i)=='C')
                                first=100;
	        	else if(str.charAt(i)=='D')
                                first=500;
      			else if(str.charAt(i)=='M')
				first=1000;
		      	else
		      		return 0;
		        if(i!=str.length()-1){
				if(str.charAt(i+1)=='I')
                                        second=1;
                                else if(str.charAt(i+1)=='V')
                                        second=5;
                                else if(str.charAt(i+1)=='X')
                                        second=10;
                                else if(str.charAt(i+1)=='L')
                                        second=50;
                                else if(str.charAt(i+1)=='C')
                                        second=100;
                                else if(str.charAt(i+1)=='D')
                                        second=500;
                                else if(str.charAt(i+1)=='M')
                                        second=1000;
			}
   
			if(second>first){
				total=total+second-first;
				i++;
			}
			else
				total=total+first;
		}
		return total;
	}
	public static void main(String[] args)throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a roman number for converting to decimal : ");
        String str=br.readLine();
        int num=romanToDecimal(str);
	if(num==0)
		System.out.println("Please enter valid roman number");
	else
		System.out.println("Decimal number of "+str+" is : "+num);
    }
}
