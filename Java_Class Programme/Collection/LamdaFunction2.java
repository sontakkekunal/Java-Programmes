interface Core2Web{
	String lang(String Company1,String Company2);
}
class Year2022{
	public static void main(String [] args){
		Core2Web c2w=(name1,name2)->{
			return "{"+name1+","+name2+"}";
		};
		System.out.println(c2w.lang("Incubator","Core2Web"));
	}
}
