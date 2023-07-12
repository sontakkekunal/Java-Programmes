class StringIsCollectionOfChar{
	public static void main(String [] args){
		//String class is character Array
		char ch[]={'K','U','N','A','L'};
		char ch1[]={'K','u','n','a','l'};
		String str="",str1="";
		for(char x: ch ){
			System.out.print(x);
			str=str+x;
		}
		System.out.println();
		for(char x: ch1 ){
                        System.out.print(x);
			str1=str1+x;
                }
		System.out.println(str+"  "+str1);
		String nw=""+ch;
		System.out.println(" nwM"+nw+"M"+str+"M");
		if(nw==str)
			System.out.println("yes");

	}
}





