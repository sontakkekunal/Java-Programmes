import java.io.*;
import myStringMethods.*;
class MyStringMethodsAccess{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String for opperation :- ");
		String strM=br.readLine();
		System.out.println("choose which method you want to perform on string :- ");
		System.out.println("1.myCharAt(String,int) \n2.myCompair(String,String) \n3.myConcat(String,String) \n4.equals1(String,String) \n5.myLastIndexOf(String,char,int) , myLastIndexOf(String,char) , myLastIndexOf(String,String) , myLastIndexOf(String,int,String) ");
		System.out.println("6. myLenStr(String) \n7.mySubString(String,int), mySubString(String,int,int) \n8.myCompair(String,String)");
		System.out.println("9.myEqualsIngoreCase(String,String)");
		System.out.println("10.myIndexOf(String,char,int) , myIndexOf(String,char) , myIndexOf(String,String) , myIndexOf(String,String,int)");
		System.out.println("11.myReplace(String,char,char) , myReplace(String,char,char) \n12.myToCharArray(String)");
		System.out.println("Choose 1/2/3/4/5/6/7/8/9/10/11/12  :-");
		int n=Integer.parseInt(br.readLine());
		
		switch(n){
			case 1:
				System.out.println("Enter index which want to find in string :- ");
				int num=Integer.parseInt(br.readLine());
				System.out.println("Character at index "+num+" in string is : "+MyCharAt.myCharAt(strM,num));
				break;
			case 2:
				System.out.println("Enter second String to compair:- ");
				String str=br.readLine();
				System.out.println("The difference between first string and second string is "+MyCompareTo.myCompair(strM,str));
				break;
			case 3:
				System.out.println("Enter second String to concat with first:- ");
				String str1=br.readLine();
				String concat=new String(MyConcateString1_2.myConcat(strM,str1));
				System.out.println("Concated string is :- "+concat);
				break;
			case 4:
				System.out.println("Enter second String to equavaluate  with first:- ");
				String str2=br.readLine();
				if(MyEquals.equals1(strM,str2))
					System.out.println("First and second string are same ");
				else
					System.out.println("First and second string are not same");
				break;
			case 5: 
				System.out.println("Using myLastIndexOf(String,char,int) method");
				System.out.println("Enter character to indecate:  ");
				char ch=(char)br.read();
				br.skip(1);
				System.out.println("Enter index to reverse start from : ");
				int num1=Integer.parseInt(br.readLine());
				System.out.println("character "+ch+" found from reverse start from "+num1+" at : "+MyLastIndexOf.myLastIndexOf(strM,ch,num1));

				System.out.println("Using myLastIndexOf(String,char) method , here revserse start from end ");
				System.out.println("character "+ch+" found from reverse at : "+MyLastIndexOf.myLastIndexOf(strM,ch));

				System.out.println("Using myLastIndexOf(String,String) , here revserse start from end");
				System.out.println("Enter string to search from reevrse : ");
				str1=br.readLine();
				System.out.println("String is found from reverse at : "+MyLastIndexOf.myLastIndexOf(strM,str1));

				System.out.println("Using myLastIndexOf(String,int,String) ");
				System.out.println("Enter index to reverse start from : ");
                		num1=Integer.parseInt(br.readLine());
            		   	 System.out.println("String is found from reverse at : "+MyLastIndexOf.myLastIndexOf(strM,num1,str1));
				 break;
			case 6:
				 System.out.println("Length of string "+strM+" is : "+MyStrLen.myLenStr(strM));
				 break;
			case 7:
				 System.out.println("Enter index where string is cut is start  : ");
		                 int n1=Integer.parseInt(br.readLine());
              			  System.out.println("Enter index to end at that string : ");
              			  int n2=Integer.parseInt(br.readLine());
              			  System.out.println("Sub String form "+n1+" to till end is : "+MySubString.mySubString(strM,n1));
        		          System.out.println("Sub String form "+n1+" to "+n2+" is : "+MySubString.mySubString(strM,n1,n2));
				 break;
			case 8:
				 System.out.println("Enter second string: ");
              		       	String strc2=br.readLine();
				System.out.println("Differnce is : "+MyCompareToIgnoreCase.myCompair(strM,strc2));
				 break;
			case 9:	
				System.out.println("Enter second string: ");
                		str2=br.readLine();
				boolean value= MyequalsIngoreCase.myEqualsIngoreCase(strM,str2);
		                System.out.println("Both string are same : "+value);
			        break;
			case 10:
				System.out.println("Enter character to indecate:  ");
                 		ch=(char)br.read();
                		br.skip(1);
                		System.out.println("Enter index to start from : ");
                		num=Integer.parseInt(br.readLine());
		                System.out.println("Index found at : "+MyIndexOf.myIndexOf(strM,ch,num));

				System.out.println("Index found at : "+MyIndexOf.myIndexOf(strM,ch)+" from beginning");

				System.out.println("Enter string to search ");
               			str1=br.readLine();
		                System.out.println("Index found at : "+MyIndexOf.myIndexOf(strM,str1));

				System.out.println("Enter index to start from : ");
                		num=Integer.parseInt(br.readLine());
		                System.out.println("Index found at : "+MyIndexOf.myIndexOf(strM,str1,num));
				break;
			case 11:
				System.out.println("Enter old character to replace:  ");
                		char ch1=(char)br.read();
                		br.skip(1);
                		System.out.println("Enter new  character to replace :  ");
                		char ch2=(char)br.read();
               			 br.skip(1);
               			 System.out.println("String after replacing is : "+MyReplace.myReplace(strM,ch1,ch2));

				 System.out.println("Enter old string to replace : ");
                		str1=br.readLine();
                		System.out.println("Enter new string to replace : ");
                		str2=br.readLine();
		                System.out.println("String after replacing is : "+MyReplace.myReplace(strM,str1,str2));

				break;
			case 12:
				char chA[]=MyToCharArray.myToCharArray(strM);
        			System.out.println("Array is :-");
        			for(int i=0;i<chA.length;i++){
                			System.out.print(chA[i]+" ");
			        }

				break;


			default:
				System.out.println("Please enter valid number");
				break;

		}
		System.out.println("Do you want to relook the programme:- \nChoose (y/n):- ");
		String YN=br.readLine();
		if(YN.equals("y"))
			main(null);
	}
}



