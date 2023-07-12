import home.kunalsontakke.Desktop.java_programme.*;
class Core2Web{
	int numCourses=8;
	String favCourse="Cpp";
	void disp(){
		System.out.println(numCourses);
		System.out.println(favCourse);
	}
}
class Student{
	public static void main(String [] args){
		Core2Web2 obj=new Core2Web2();
		obj.disp();
		System.out.println(obj.numCourses);
                System.out.println(obj.favCourse);
	}
}
