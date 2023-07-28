class MyThread{
	public static void main(String [] args){
		Thread t= Thread.currentThread();
		System.out.println(t.getClass().getSimpleName());
		System.out.println((Thread.currentThread()).getClass().getSimpleName());
	}
}
