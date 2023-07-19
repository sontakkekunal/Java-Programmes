import java.io.*;
class SeatFullException extends RuntimeException{
	SeatFullException(String msg,int reqSeat){
		super(msg+" for requerd seats "+reqSeat+"\nNote: Seats in bus are 35");
	}
}
class TourUnavaibleException extends RuntimeException{
	TourUnavaibleException(String msg){
		super(msg);
	}
}
class BusTour{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Bus Tour");
		System.out.println("Select following option");
		System.out.println("1.Lonavala\n2.Raigad\n3.Rajgad\n4.Torna");
		int option=Integer.parseInt(br.readLine());
		String tourTo="";
		switch(option){
			case 1:
				tourTo="Lonavala";
				break;
			case 2:
				throw new TourUnavaibleException("Currently tour to Raigad unavalibale");
			case 3:
				tourTo="Rajgad";
				break;
			case 4:
				throw new TourUnavaibleException("Currently tour to Torna unavalibale");
			default:
		}
		System.out.println("Enter number of passangers : ");
		System.out.println("User 1: ");
		int passangers1=Integer.parseInt(br.readLine());
		if(passangers1>35){
                        throw new SeatFullException("Insuffient seats",passangers1);
                }
		System.out.println("User 2: ");
		int passangers2=Integer.parseInt(br.readLine());
		if(passangers1+passangers2>35){
			throw new SeatFullException("Insuffient seats",passangers2+passangers1);
		}
		System.out.println("User 3: ");
                int passangers3=Integer.parseInt(br.readLine());
		if(passangers1+passangers2+passangers3>35){
                        throw new SeatFullException("Insuffient seats",passangers2+passangers1+passangers3);
                }
		System.out.println("Tour Succesfully planed to "+tourTo+" with "+(passangers3+passangers1+passangers2)+" passangers ");
	}
}



