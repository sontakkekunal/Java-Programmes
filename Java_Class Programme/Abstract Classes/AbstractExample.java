abstract class ComputerMemory{
	abstract  void userMemoryAllocated();
	final void systemMemory(){
		System.out.println("45 MB");
	}
}
class DiskManger extends ComputerMemory{
	void userMemoryAllocated(){
		System.out.println("500 GB");
	}
}
class User{
	public static void main(String [] args){
        	DiskManger size = new DiskManger();
		size.systemMemory();
		size.userMemoryAllocated();
	}
}

