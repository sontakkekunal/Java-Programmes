import java.io.*;
class NaughtyUserException extends Exception{
	NaughtyUserException(String str){
		super(str);
	}
}
class Writer extends Thread{
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f1=new File("Communication.txt");
		if(f1.exists())
			f1.delete();
		//f1.close();
		String str="";
		try{
		while(!str.equals("ks.stop")){
			File f= new File("Communication.txt");
			if(!(f.exists()))
				f.createNewFile();
			FileWriter fw= new FileWriter(f,true);
			str=br.readLine();
			if(str.equals("ks.stop")){
				str="!";
			}
			fw.write(str+  "\n");
			fw.close();
			/*
			if(str.contains("boobs"||"Boobs"))
				throw new NaughtyUserException("Halwa ha kya! ");
				*/
			Thread.sleep(1000);
		}
		}catch(IOException ie){}
		catch(InterruptedException ie){}
	}
}
class Reader extends Thread{
	public void run(){
		//BufferedReader br = new BufferedReader(new InputSteamReader(System.in));
                File f1=new File("Communication.txt");
		try{
		/*
                if(!f1.exists())
                        throw new FileNotFoundException("File nahi yaa");
			*/
		System.out.println("in");
		FileReader fr= new FileReader(f1);
		int data=fr.read();
		int i=0;
		int track=0;
		boolean flag=true;
		while(data!=33){
			System.out.println("hi");
			while(data==-1){
				if(flag){
					track=i;
					flag=false;
				data=fr.read();
				f1=new File("Communication.txt");
				fr=new FileReader(f1);
				i=0;
				}
			}
			flag=true;
			if(i>=track){
				System.out.println("User1: "+((char)data));
			}	
			if(data==10){
				i++;
			}
			data=fr.read();
		}
		}catch(IOException ie){}
	}
}
class FileTransferChatBot1{
	public static void main(String [] args)throws InterruptedException{
		Writer w = new Writer();
		w.start();

		Thread.sleep(500);

		Reader r= new Reader();
		r.start();
	}
}


