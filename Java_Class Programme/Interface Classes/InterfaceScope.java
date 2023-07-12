interface Demo{
	void fun();
	void gun();
}
class ChildDemo implements Demo{
	void fun(){  //<---decreasing scope to default from public 
		System.out.println("In fun");
	}
	void gun(){  //<----decreasing scope to default from public , so error
		System.out.println("In gun");
	}
}
