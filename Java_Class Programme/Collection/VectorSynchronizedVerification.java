import java.util.*;
import java.util.concurrent.*;
import java.io.*;
class MyThread extends Thread{
	int num=0;
	MyThread(int num){
		this.num=num;
	}
	void task(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException ie){
		}
	}
	public void run(){
		if(num==1){
			System.out.println("Thread task start");
                        ArrayList al= new ArrayList();
                        al.add("Kunal");
                        al.add("Satara");
			//task();
                        al.add("Pune");
			al.add("Noida");
                        System.out.println(al);
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("thread task end ");
                  
		}
		else if(num==2){
			System.out.println("Thread task start for Vector");
			Vector v= new Vector();
			v.addElement("Kunal");
			v.addElement("Satara");
			//task();
			v.addElement("Pune");
			v.addElement("Jaipur");
			System.out.println(v);
			System.out.println(Thread.currentThread().getName());
                        System.out.println("thread task end ");
		}

	}

}


class Client{
	public static void main(String [] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Do you want to implement ArrayList or Vector in MutiThreading: ");
		System.out.println("1.ArrayList/2.Vector");
		int num=Integer.parseInt(br.readLine());
		ExecutorService ser =Executors.newFixedThreadPool(3);
		MyThread obj = new MyThread(num);
		for(int i=0;i<3;i++){
			ser.execute(obj);
		}
		ser.shutdown();

	}
}
