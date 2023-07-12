class ThisCallConsRev{
        int x=10;
        ThisCallConsRev(){
		this(10); // this() will another constructor
                System.out.println("In no argument constructor");
        }
        ThisCallConsRev(int x){
                this(); // this() will another constructor
                System.out.println("In parameter constructor");
        }
}


