import java.io.*;
class MultiOperation{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st arry Size: ");
		int size1=Integer.parseInt(br.readLine());
		System.out.println("Enter 2st arry Size: ");
		int size2=Integer.parseInt(br.readLine());
		System.out.println("Enter 3st arry Size: ");
		int size3=Integer.parseInt(br.readLine());

		if(size1>size2 || size2>size3 || size1>size3){
			System.out.println("Please enter size in this format size1<=size2<=size3 : ");
			System.exit(0);
		}
		int arr1[]=new int[size1];
		int arr2[]=new int[size2];
		int arr3[]=new int[size3];
		System.out.println("Enter array 1st");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}
	 	System.out.println("Enter array 2st");
		for(int i=0;i<arr2.length;i++){
                        arr2[i]=Integer.parseInt(br.readLine());
                }
		System.out.println("Enter array 3st");
		for(int i=0;i<arr3.length;i++){
                        arr3[i]=Integer.parseInt(br.readLine());
                }
		int arrR[]= new int[arr3.length];
		int a=0,b=1,c=2,d=3;
		int secStart=0;
		for(int i=0;i<arr1.length;i++){
			if(i==a){
				arrR[i]=arr1[i]+arr2[i]+arr3[i];
				a=a+4;
				secStart=1;
			}
			if(i==b){
				arrR[i]=arr1[i]-arr2[i]-arr3[i];
                                b=b+4;
				secStart=2;
			}
			if(i==c){
				arrR[i]=arr1[i]*arr2[i]*arr3[i];
                                c=c+4;
				secStart=3;
			}
			if(i==d){
				arrR[i]=arr1[i]/arr2[i]/arr3[i];
                                d=d+4;
				secStart=0;
			}
		}
		boolean b1=false,b2=false,b3=false,b4=false;
		
		for(int i=arr1.length;i<arr2.length;i++){
			if(secStart==0 || b1){
				arrR[i]=arr2[i]+arr3[i];
                                secStart=-100;
				b1=false;b2=true;b3=false;b4=false;
				continue;
			}
			if(secStart==1 || b2){
                                arrR[i]=arr2[i]-arr3[i];
                                secStart=-100;
                                b1=false;b2=false;b3=true;b4=false;
				continue;
                        }
			if(secStart==2 || b3){
                                arrR[i]=arr2[i]*arr3[i];
                                secStart=-100;
                                b1=false;b2=false;b3=false;b4=true;
				continue;
                        }
			if(secStart==3 || b4){
                                arrR[i]=arr2[i]/arr3[i];
                                secStart=-100;
                                b1=true;b2=false;b3=false;b4=false;
                        }
		}
		for(int i=arr2.length;i<arr3.length;i++){
			arrR[i]=arr3[i];
		}
		System.out.println("Multiple operation on  result on arrays ");
		for(int i=0;i<arrR.length;i++){
			System.out.print(arrR[i]+"  ");
		}
	}
}





