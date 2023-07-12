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
        String  deciToRoman(int value1){
                value=value1;
		int num1=1000;
		String arr[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
		int size=arr.length-1;
		boolean bool=true;
		while(value!=0){
                        if(value>=num1){
                                modeing(num1,arr[size]);
			}
			if(size==0)
				break;
			size--;
			int temp=num1;
	                int temp2=0;
			while(temp!=0){
				temp2=temp%10;
				if(temp2==5)
					break;
				temp=temp/10;
			}
			if(temp2==4){
				num1=(100*num1)/80;
				num1=(20*num1)/100;
				continue;
			}
			if(temp2==5){
				num1=num1-((20*num1)/100);
			}
			else{
				if(bool){
			        	num1=num1-((10*num1)/100);
					bool=false;
				}
				else{
					num1=(100*num1)/90;
					num1=num1-((50*num1)/100);
					bool=true;
				}
			}
		}
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

