//write a progarm to print the following pattern
//1 2 9
//4 25 6
//49 8 81
//USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=3;i++){
//    for(int j=1;j<=3;j++){
//         }
//   }
class Pattern7{
	public static void main(String [] args){
		int num=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){
				if(i==j || (i==1 && j==3) ||(i==3 && j==1))
			        	System.out.print((num*num)+" ");
				else
					System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
