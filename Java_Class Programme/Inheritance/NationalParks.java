class NationalParks{
	NationalParks(){
		System.out.println("In NationalParks");
	}
	void parksProperties(){
		System.out.println("Protected area of parks,protected animals");
	}
}
class KazirangaNationalPark extends NationalParks{
	KazirangaNationalPark(){
		System.out.println("In KazirangaNationalParks");
	}
}
class RanthamboreNationalPark extends NationalParks{
	RanthamboreNationalPark(){
		System.out.println("In RanthamboreNationalPark");
	}
}
class Visitor{
	public static void main(String [] args){
		KazirangaNationalPark ticket = new KazirangaNationalPark();
		ticket.parksProperties();
	}
}
		

