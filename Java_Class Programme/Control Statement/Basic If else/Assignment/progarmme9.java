class Programme9{
    public static void main(String [] args){
        double a=3;
        double b=4;
        double c=5;
        a=a*a;
        b=b*b;
        c=c*c;
        if(a+b==c || a+c==b || b+c==a){
            System.out.println("it is a Pythagorean triplet");
        }
        else{
            System.out.println("it is not a Pythagorean triplet");
        }
    }
}
