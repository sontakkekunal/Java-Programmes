class Mythread extends Thread{
	void name(){
		System.out.println("this name");
		for(int i=0;i<10;i++){
			System.out.println(i);
		}
	}
	public void run(){//  throws InterruptedException  <--error{
		System.out.println("in run");
		name();
	}
}
class Demo{
	public static void main(String [] args){
		System.out.println("Start main");
		Mythread obj = new Mythread();
		obj.start();
		for(int i=10;i<20;i++){
                        System.out.println(i);
                }

		System.out.println("End main");
	}
}
