//Finally Block is used for closing connection,beasuse finally block is exuted at any condition
class Demo{
        void m1(){
                System.out.println("In m1");
        }
        void m2(){
                System.out.println("In m2");
        }
        public static void main(String [] args){
                Demo obj = new Demo();
                obj.m1();
                obj=null;
                try{
                        obj.m2();
                }catch(ArithmeticException obj4){ //<-If occured Exception is catched by catchblock then after excution of catchBlock the finally block
                                                   //<-is Excuted
                        System.out.println("Here");
                }
                //If occured Ecxception  is not catched by catch block then before throwing Exception to caller i.e. to jvm , the finally Block is
                // excuted . I.e. first finally block excution then throwing exception to caller 
                finally{  //<-Even though exception occurs or not the finally block is excuted
                        System.out.println("Connection closed");
                }
        }
}

