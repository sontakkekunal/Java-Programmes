class CLA1{
	public static void main(String...args){
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
		System.out.println("Size of array is: "+args.length);
		if(args.length>3){
			String sum;
			sum=args[0]+args[1]+args[2];
			System.out.println(" merging of first 3 element is "+sum);
		}

	}
}
