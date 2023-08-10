import java.util.*;
class LinuxVersion{
	int ver=0;
	String type=null;
	LinuxVersion(int ver,String type){
		this.ver=ver;
		this.type=type;
	}
	public String toString(){
		return type+":"+ver;
	}

}
class LinuxClient{
	public static void main(String [] args){
		LinkedList ll= new LinkedList();
		ll.add(new LinuxVersion(23,"Ubuntu"));
		ll.add(new LinuxVersion(11,"Windows"));
		ll.add(new LinuxVersion(10,"Windows"));
		ll.add(new LinuxVersion(7,"Windows").ver);
		ll.add(new LinuxVersion(23,"KaliLinux"));
		System.out.println(ll);
	}
}

