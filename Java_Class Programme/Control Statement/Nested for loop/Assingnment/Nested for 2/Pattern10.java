//write a progarm to print the following pattern
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//F 5 D 3 B 1
//USE THIS FOR LOOP SRRICTILY
//for(int i=1;i<=6;i++){
//    for(int j=1;j<=6;j++){
//         }
//   }
class Pattern6{
	public static void main(String [] args){
		for(int i=1;i<=6;i++){
			char ch='F';
			int n=6;
			for(int j=1;j<=6;j++){
				if(j%2==1)
					System.out.print(ch+" ");
				else
					System.out.print(n+" ");
				ch--;
				n--;
			}
			System.out.println();
		}
	}
}

