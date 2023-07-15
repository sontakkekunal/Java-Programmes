class Demo{
	public static void main(String [] args){
		for(int i=0;i<10;i++){
			System.out.println("In loop"); //will be printed 10 time after each 5 s delay
			try{
				Thread.sleep(5000);  //On class Thread static method sleep is called
						     //this method will create delay of 5s 
			}catch(RuntimeException obj){ //<-the unchecked exception must be written in child parent parameter catch sequence validity  
				}
			catch(InterruptedException obj){ //<- we can write any checked exception , any however
				}  
		}
	}
}
