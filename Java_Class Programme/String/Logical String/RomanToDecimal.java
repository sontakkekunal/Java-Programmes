import java.io.*;
class RomanTODecimal{
    static int romanToDecimal(String str){
	str=str.toUpperCase();
        int arr[]=new int[str.length()];
        for(int i=0;i<arr.length;i++){
            if(str.charAt(i)=='I')
                arr[i]=1;
	    else if(str.charAt(i)=='V')
                arr[i]=5;
	    else if(str.charAt(i)=='X')
                arr[i]=10;
	    else if(str.charAt(i)=='L')
                arr[i]=50;
	    else if(str.charAt(i)=='C')
                arr[i]=100;
	    else if(str.charAt(i)=='D')
                arr[i]=500;
	    else if(str.charAt(i)=='M')
                arr[i]=1000;
	    else
		    return 0;
        }
        int total=0;
        boolean bool=false;
        for(int i=0;i<arr.length;i++){
            if(bool){
                bool=false;
                continue;
            }
            if(i==arr.length-1){
                total=total+arr[i];
                break;
            }
            if(arr[i]<arr[i+1]){
                total=total+arr[i+1]-arr[i];
                bool=true;
            }
            else
                total=total+arr[i];
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
