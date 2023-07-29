//WAP to take 7 charcters as an input,print only vowels from array
//Input: a b c o d p e
//Output: a o e
import java.util.Scanner;
class ArrayVowels{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char arr[] =new char[7];
        System.out.println("Enter array elements ");
        for(int i=0;i<7;i++){
            arr[i]=(char)sc.next().charAt(0);
            
        }
	System.out.print("Vowels: ");
        for(int i=0;i<7;i++){
            if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'){
                System.out.print(arr[i]+ " ");
            }
        }
	System.out.println();
    }
    
}
