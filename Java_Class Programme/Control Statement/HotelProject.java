import java.io.*;
class HotelProject{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Welcome to shrisha hotel");
		boolean flag=true;
		int total=0;
		while(flag){
			int choice=0;
			boolean flag1=false;
			System.out.println("what do you like to have: ");
			System.out.println("1.VadaPav  Rs. 15");
			System.out.println("2.SamoSa   Rs. 10");
			System.out.println("3.PavBhaji Rs. 60");
			System.out.println("4.IdleVada Rs. 30");
			System.out.println("5.i am over ");
			System.out.println("Choose 1/2/3/4/5:  ");
			System.out.println("Any other input is concerted as over");
			choice=Integer.parseInt(br.readLine());
			switch(choice){
				case 1:
					total=total+15;
					break;
				case 2:
					total=total+10;
					break;
				case 3: 
					total=total+60;
					break;
				case 4:
					total=total+30;
					break;
				default:
					flag1=true;
					System.out.println("Thank you sir:");
					break;
			}
			if(flag1)
				break;
			else{
				System.out.println("Do you more meal : ");
				System.out.println("choose y/n");
				String val=br.readLine();
				if(val.equals("n"))
					flag=false;
			}
		}
		System.out.println("Your total is :"+total);
	}
}





