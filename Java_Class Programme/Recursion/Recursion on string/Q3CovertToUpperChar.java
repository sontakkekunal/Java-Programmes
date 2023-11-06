/*
 Q3.
WAP to convert all characters in the array to uppercase.
*/
import java.util.Scanner;
class Q3CovertArrToUpperCase{
	int i=0;
	void convertCharToUpper(char[] ch){
		if(i>=ch.length)
			return;
		//ch[i]=Character.toUpperCase(ch[i]);
		String str=ch[i]+"";
		ch[i]=(str.toUpperCase()).charAt(0);
		i++;
		convertCharToUpper(ch);
	}
	public static void main(String [] args){
                Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
                System.out.println("Enter characters array: ");
		char ch[]= new char[size];
		for(int i=0;i<size;i++){
			ch[i]=sc.next().charAt(0);
		}
		
		new Q3CovertArrToUpperCase().convertCharToUpper(ch);
		System.out.println("Output: ");
		for(int i=0;i<size;i++){
                        System.out.print(ch[i]+ "  ");
                }
		System.out.println();
	}
}
