enum LineUp{
	Rohit,
	Gill,
	Virat,
	KLRahul,
	Ishan;
	
	public static void main(String [] args){
		LineUp player=LineUp.Virat;//accesing enum class_name(LineUp) object and storing it
		switch(player){  //switch accept enum type object 
			case Rohit:
				System.out.println("Sharma");
				break;
			case Gill:
				System.out.println("Saarra");
				break;
			case Virat:
				System.out.println("Ben");
				break;
			case KLRahul:
				System.out.println("Anna");
				break;
			case Ishan:
				System.out.println("Negi");
				break;
			default:
				System.out.println("Afridi");
		}
	}
}
