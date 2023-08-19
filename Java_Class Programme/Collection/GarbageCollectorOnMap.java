import java.util.*;
class Demo{
        String str=null;
        Demo(String str){
                this.str=str;
        }
        public String toString(){
                return str;
        }
        public void finalize(){//maintaing scope and primivitive return type of overided method
                System.out.println("Notification: "+/*+str+*/" Object deleted");
        }
}
class GCDemo{
        public static void main(String [] args){
                Demo obj1= new Demo("Core2Web");
                Demo obj2= new Demo("Biencaps");
                Demo obj3= new Demo("Incubater");

                //HashMap h= new HashMap();<--Hash Dominate the garbage collector
						//whenever any object of hashmap is null(un-referred) the garbage cannot delete that object
		WeakHashMap h = new WeakHashMap();//garbage can delete null(un-referred) object of the WeakHashMap
		h.put(obj1,2016);
		h.put(obj2,2019);
		h.put(obj3,2020);
                obj1=null;//un-referring object
                obj2=null;//un-referring objecty
                System.gc();//calling garbage collector manullay
                System.out.println("In main");
        }
}

