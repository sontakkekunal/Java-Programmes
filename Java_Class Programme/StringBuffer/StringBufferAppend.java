class StringBufferAppend{
	public static void main(String [] args){
		StringBuffer sb1= new StringBuffer("Kunal");
		System.out.println("First StringBuffer is : "+sb1);
		System.out.println("Afte appending with app1 ");
		StringBuffer app1=new StringBuffer("Sontakke");
		System.out.println(sb1.append(app1));

		StringBuffer sb2= new StringBuffer("kunal");
                System.out.println("Second StringBuffer is : "+sb2);
                System.out.println("Afte appending with app2 ");
                String app2="sontakke";
                System.out.println(sb2.append(app2));
	}
}

