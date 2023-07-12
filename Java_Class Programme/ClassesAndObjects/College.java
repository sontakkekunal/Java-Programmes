class InfoCollege{
	String management="maintenance of college,availability of teachers";
	int fundOfCollege=10000000;
	static int studentfee=100000;
	static String branches="CS,IT,AIDS,ENTC";
	void info(){
		System.out.println("College manages:- "+management);
		System.out.println("college has funds of rs = "+fundOfCollege);
		System.out.println("Student fee is = "+studentfee);
		System.out.println("College has branches = "+branches);
	}
}
class College{
	public static void main(String [] args){
		InfoCollege admin1=new InfoCollege();
		InfoCollege admin2=new InfoCollege();
		admin1.info();
		admin2.info();

	        System.out.println("------------------");

		admin1.fundOfCollege=1000000000;
		admin1.studentfee=100;
		admin1.management="nothing";
		admin1.branches="Civil,Mechanical";

		admin1.info();
		admin2.info();
	}
}
