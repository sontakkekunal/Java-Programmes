class ICC{
	ICC(){
		System.out.println("In ICC constrictor");
	}
}
class BCCI extends ICC{
	//ICC() //<--- Hidden call
	BCCI(){
		System.out.println("In BCCI constrictor");
	}
}
class Client{
	public static void main(String [] args){
		BCCI obj = new BCCI();
	}
}
