class KrishnaTemple{
    int noOfSwaminarayanTemple=180;
    int noOfISKONTemple=1000;
    String baps="List of Swaminarayan Mandir: ";
    String iskon="List of ISKON Mandir: ";
    String listOfBAPSTemple[]={"Swaminarayan Mandir , Ahmedabad","Swaminarayan Mandir,London","Swaminarayan Mandir,Pune"};
    String listOfISKON[]={"ISKCON Temple, Mayapur","ISKCON Temple,Bangalore","ISKCON Temple, Vrindavan"};
    //using array as data type
    void swaminarayanMandir(){
        System.out.println(baps);
        for(int i=0;i<listOfBAPSTemple.length;i++){
            System.out.println(listOfBAPSTemple[i]);
        }
    }
    void iskonMandir(){
        System.out.println(baps);
        for(int i=0;i<listOfISKON.length;i++){
            System.out.println(listOfISKON[i]);
        }
    }
}
class Devotee{
    public static void main(String [] args){
        KrishnaTemple devotion=new KrishnaTemple();
        devotion.swaminarayanMandir();
        devotion.iskonMandir();
    }
}
