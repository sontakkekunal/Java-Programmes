import java.io.*;
class DecimalToRoman{
	int value=0;
	String rnum="";
	void modeing(int num1,String str){
		int noOTime=value/num1;
		for(int i=0;i<noOTime;i++){
			rnum=rnum+str;
			value=value-num1;
		}
	}
	void defact(int num1,String str){
		rnum=rnum+str;
		value=value-num1;
	}
	String  deciToRoman(int value1){
		value=value1;
		if(value>=1000){
			modeing(1000,"M");
		}
		int temp=900;
		if(temp<=value){
			defact(temp,"CM");
		}
		if(value>=500){
			modeing(500,"D");
		}
		temp=400;
		if(value>=temp){
			defact(temp,"CD");
		}
		if(value>=100){
			modeing(100,"C");
		}
		temp=90;
		if(value>=temp){
			defact(temp,"XC");
		}
		if(value>=50){
			modeing(50,"L");
		}
		temp=40;
		if(value>=temp){
			defact(temp,"XL");
		}
		if(value>=10){
			modeing(10,"X");
		}
		temp=9;
		if(value>=temp){
			defact(temp,"IX");
		}
		if(value>=5){
			modeing(5,"V");
		}
		temp=4;
		if(value>=temp){
			defact(temp,"IV");
		}
		if(value>=1){
			modeing(1,"I");
		}
		System.out.println(value);
		return rnum;
	}
}

			

class Client{
	public static void main(String [] args )throws IOException{
        	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        	System.out.println("Enter a number to convert to Roman Number:-  ");
         	Integer num=Integer.parseInt(br.readLine());
        	DecimalToRoman obj= new DecimalToRoman();
        	System.out.println("Roman number is :- "+obj.deciToRoman(num));
	}
}
