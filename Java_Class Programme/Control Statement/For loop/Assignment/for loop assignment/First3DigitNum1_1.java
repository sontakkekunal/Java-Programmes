//write a program to print the first ten,3 digit number.
class First3DigitNum{
	static public void main(String [] vgv){
		//(int num=1;num<=150;num++)
		//(int num=0;num<=150;num++)
		for(int num=0;num<151;num++){
			int temp=num;
			int count=0;
			//temp>0
			//temp>=1
			while(temp!=0){
				count++;
				temp=temp/10;
			}
			if(count==3 && num<110){
				System.out.println(num);
			}
		}
	}
}



