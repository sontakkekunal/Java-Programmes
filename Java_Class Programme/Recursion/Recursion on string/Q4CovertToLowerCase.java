/*
Q4.
WAP to convert all characters to lowercase 
 */
import java.util.Scanner;
class Q4CovertArrToLowerCase{
	int i=0;
	void convertCharToLower(char[] ch){
		if(i>=ch.length)
			return;
		//ch[i]=Character.toLowerCase(ch[i]);
		String str=ch[i]+"";
		ch[i]=(str.toLowerCase()).charAt(0);
		i++;
		convertCharToLower(ch);
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
		
		new Q4CovertArrToLowerCase().convertCharToLower(ch);
		System.out.println("Output: ");
		for(int i=0;i<size;i++){
                        System.out.print(ch[i]+ "  ");
                }
		System.out.println();
	}
}
