class Print1to10{
	int i=1;
	void numPrint(){
		if(i<=10){
			System.out.println(i++);
			numPrint();
		}
	}
	public static void main(String [] rg){
		new Print1to10().numPrint();
	}
}
