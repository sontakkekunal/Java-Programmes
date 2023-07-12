//WAP to find the uncommon elements between two arrays.
//Input :
//Enter first array : 1 2 3 5
//Enter Second array: 2 1 9 8
//Output: Uncommon elements :
//3
//5
//9
//8
import java.io.*;
class UnCommonElement{
	public static void main(String [] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int size[]=new int[2];
		System.out.println("Enter the size of first array : ");
		size[0]=Integer.parseInt(br.readLine());
		System.out.println("Enter the size of second array : ");
		size[1]=Integer.parseInt(br.readLine());
		int arr1[]=new int[size[0]];
		int arr2[]=new int[size[1]];
		for(int i=0;i<size[0];i++){
			   System.out.println("Enter 1st array "+(i+1)+" element : ");
		           arr1[i]=Integer.parseInt(br.readLine());	
		}
		for(int i=0;i<size[1];i++){             
                           System.out.println("Enter 2st array "+(i+1)+" element : ");
                           arr2[i]=Integer.parseInt(br.readLine());
                }
		int temparr1[]=arr1;
		int temparr2[]=arr2;
		System.out.println("Uncomman elements are ");
		for(int i=0;i<2;i++){
			for(int j=0;j<temparr1.length;j++){
				int count=0;
				for(int k=0;k<temparr2.length;k++){
					if(temparr1[j]==temparr2[k])
						count++;
				}
				if(count==0)
					System.out.print(temparr1[j]+" ");
			}
			int temp[]=temparr1;
			temparr1=temparr2;
			temparr2=temp;
		}
		System.out.println();
	}
}

