class MacDe{
	int NoOfBurger=5;
	String Product="FrenchFries";
	void Menu(){
		String menu1="Veg";
		String menu2="Non-veg";
		System.out.println(NoOfBurger);
		System.out.println(Product);
	}
}
class User{
	public static void main(String [] args){
		MacDe obj=new MacDe();
		obj.Menu();
	}
}
