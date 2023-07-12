class Project{
	String projName="Online Edu";
	int noOfEmp=20;
	void clientInfo(){
		String ClinetName="core2Web";
		System.out.println(ClinetName);
		System.out.println(projName);
	}
}
class C2W{
	public static void main(String [] args){
		Project obj=new Project();
		obj.clientInfo();
	}
}
