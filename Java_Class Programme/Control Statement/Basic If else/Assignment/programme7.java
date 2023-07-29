
class ProfitOrLoss{
	public static void main(String args[]){
		
		int sP=300;
		int cP=200;
		if(sP>cP)
			System.out.println("Profit of "+(sP-cP));
		else if(cP>sP)
			System.out.println("Loss of "+(cP-sP));
		else
			System.out.println("No profit, no loss");
		}
}
