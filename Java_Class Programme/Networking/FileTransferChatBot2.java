import java.io.*;
class NaughtyUserException extends Exception{
	NaughtyUserException(String str){
		super(str);
	}
}
class Writer2 extends Thread{
	Reader2 r=null;
	Writer2(Reader2 r){
		this.r=r;
	}
	public void run(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		File f1=new File("Communication.txt");
		if(f1.exists());
			//f1.delete();
		//f1.close();
		String str="";
		try{
		while(!str.equals("ks.stop")){
			File f= new File("Communication.txt");
			if(!(f.exists()))
				f.createNewFile();
			FileWriter fw= new FileWriter(f,true);
			System.out.println("Enter your message: "); 
			str=br.readLine();
			if(str.equals("")){
					r.join(1000);
					continue;
			}
			if(str.equals("ks.stop")){
				str="!";
			}
			fw.write(str+  "\n.");
			r.track++;
			fw.close();
			/*
			if(str.contains("boobs"||"Boobs"))
				throw new NaughtyUserException("Halwa ha kya! ");
				*/
			r.join(1000);
		}
		}catch(IOException ie){}
		catch(InterruptedException ie){}
	}
}
class Reader2 extends Thread{
	int track=0;
	public void run(){
		//BufferedReader br = new BufferedReader(new InputSteamReader(System.in));
                File f1=new File("Communication.txt");
		try{
		/*
                if(!f1.exists())
                        throw new FileNotFoundException("File nahi yaa");
			*/
		FileReader fr= new FileReader(f1);
		int data=fr.read();
		int i=1;
		boolean flag=true;
		boolean flagS=true;
		while(data!=33){
			while(data==-1){
				if(flag){
					track=i;
					flag=false;
				}
				data=fr.read();
				f1=new File("Communication.txt");
				fr=new FileReader(f1);
				i=0;
				
			}
			flag=true;
			if(i>track){
				if(data!=46){
					if(flagS){
						System.out.println("User1: ");
						flagS=false;
					}
					System.out.print(((char)data));
				}
				else
					System.out.print(((char)data)+"User1: ");
				Thread.sleep(1000);
			}
			//System.out.println("User1: "+((char)data));	
			if(data==46){
				i++;
			}
			data=fr.read();
		}
		}catch(IOException ie){}
		catch(InterruptedException ie){}
	}
}
class FileTransferChatBot2{
	public static void main(String [] args)throws InterruptedException{
		Reader2 r= new Reader2();
                r.start();

		Thread.sleep(200);

		Writer2  w= new Writer2(r);
		w.start();
	}
}
