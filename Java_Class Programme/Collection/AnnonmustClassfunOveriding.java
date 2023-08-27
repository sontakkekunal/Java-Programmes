interface Core2Web{
	void lang();
}
class Year2022{
	public static void main(String [] args){
		Core2Web obj= new Core2Web(){//annouymous class by parent Core2Web, name of this annouymous class is Year2022$1
			public void lang(){//overding method lang taken from parent
					   //in iterface parent all method are public abstract so maintaining scope in this child class
				System.out.println("BootCamp/Java/Python/OS");
			}
		};
		obj.lang();
	}
}
//before adding public 
//rror: lang() in <anonymous Year2022$1> cannot implement lang() in Core2Web
//			void lang(){//overding method lang taken from parent
			//     ^
//  attempting to assign weaker access privileges; was public


