class OneCatchMutipleException{
	public static void main(String [] args){
		try{
			System.out.println(10/0);
		}
		catch(NullPointerException | IndexOutOfBoundsException | ArithmeticException obj){ 		
 		//catch(NullPointerException | RuntimeException obj){ <--- error           	//mutiple sibling Exception parameter is allowed to
											        //single catch block
												    //mutiple Exception must be sibling
												    //if paremter are in parent child relation,then erro 
			System.out.println("Divide by 0 not allowed");
		}
	}
}
