class ThisCallCons{
        int x=10;
        ThisCallCons(){
                System.out.println("In no argument constructor");
        }
        ThisCallCons(int x){
		this();
                System.out.println("In parameter constructor");
        }
	public static void main(String [] atkj){
		ThisCallCons obj = new ThisCallCons(50);
	}

}

