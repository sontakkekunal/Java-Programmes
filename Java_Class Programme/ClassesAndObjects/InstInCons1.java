class InstInCons1{
        int x=10;
        InstInCons1(){
                System.out.println("In no argument constructor");
        }
        InstInCons1(int x){
                System.out.println("In parameter constructor");
        }
	public static void main(String [] args){
		InstInCons1 obj1= new InstInCons1();
		InstInCons1 obj2= new InstInCons1(10);
	}
}

