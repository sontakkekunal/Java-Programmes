//write a progarm to print the following pattern

//USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=4;i++){
//    for(int j=1;j<=4;j++){
//         }
//   }
class Pattern2{
	public static void main(String [] args){
		int temp=14;
		int temp1=0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print((temp--)+" ");
				if(j==2)
					temp1=temp;
			}
			temp=temp1;
			
			System.out.println();
		}
	}
}


