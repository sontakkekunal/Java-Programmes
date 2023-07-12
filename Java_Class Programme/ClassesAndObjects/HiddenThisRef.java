class HiddenThisRef{
        int x=10;
        HiddenThisRef(){  //HiddenThisRef(HiddenThisRef this)
                System.out.println("In no argument constructor");
        }
        HiddenThisRef(int x){  // HiddenThisRef(HiddenThisRef this)
                System.out.println("In parameter constructor");
        }
	public static void main(String [] args){  
		HiddenThisRef obj1= new HiddenThisRef(); // = new HiddenThisRef(obj1);
		HiddenThisRef obj2= new HiddenThisRef(10);  // = new HiddenThisRef(obj2);
	}
}

