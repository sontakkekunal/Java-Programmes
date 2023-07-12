//write a progarm to print the following pattern
//C2W1 C2W2 C2W3
//C2W1 C2W2 C2W3
//C2W1 C2W2 C2W3
class Pattern1{
	public static void main(String [] args){
		for(int i=1;i<=3;i++){
			int n=1;
			for(int j=1;j<=3;j++){
				System.out.print("C2W"+(n++)+" ");
			}
			System.out.println();
		}
	}
}

