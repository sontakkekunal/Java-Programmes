class SameStringRunTime{
	public static void main(String [] args){
		for(int i=0;i<args.length;i++){
			System.out.println("Identity hash code of "+args[i]+" is "+System.identityHashCode(args[i]));
		
		}
	}
}

