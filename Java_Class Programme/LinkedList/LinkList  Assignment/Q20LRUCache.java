/*
 20. LRU Cache
Design a data structure that works like a LRU Cache. Here cap denotes the capacity of the
cache and Q denotes the number of queries. Query can be of two types:
SET x y: sets the value of the key x with value y
GET x: gets the key of x if present else returns -1.
The LRUCache class has two methods get() and set() which are defined as follows.
get(key): returns the value of the key if it already exists in the cache otherwise returns -1.
set(key, value): if the key is already present, update its value. If not present, add the key-value
pair to the cache. If the cache reaches its capacity it should invalidate the least recently used
item before inserting the new item.
In the constructor of the class the capacity of the cache should be initialized.

Example 1:
Input:
cap = 2
Q = 2
Queries = SET 1 2 GET 1
Output: 2
Explanation:
Cache Size = 2
SET 1 2 GET 1
SET 1 2 : 1 -> 2
GET 1 : Print the value corresponding

to Key 1, ie 2.
Example 2:
Input:
cap = 2
Q = 8
Queries = SET 1 2 SET 2 3 SET 1 5
SET 4 5 SET 6 7 GET 4 SET 1 2 GET 3
Output: 5 -1
Explanation:
Cache Size = 2
SET 1 2 : 1 -> 2
SET 2 3 : 1 -> 2, 2 -> 3 (the most recently
used one is kept at the rightmost position)
SET 1 5 : 2 -> 3, 1 -> 5
SET 4 5 : 1 -> 5, 4 -> 5 (Cache size is 2, hence
we delete the least recently used key-value pair)
SET 6 7 : 4 -> 5, 6 -> 7
GET 4 : Prints 5 (The cache now looks like
6 -> 7, 4->5)
SET 1 2 : 4 -> 5, 1 -> 2
(Cache size is 2, hence we delete the least
recently used key-value pair)
GET 3 : No key value pair having
key = 3. Hence, -1 is printed.
Expected Time Complexity: O(1) for both get() and set().
Expected Auxiliary Space: O(1) for both get() and set().
(Although, you may use extra space for cache storage and implementation purposes).

Constraints:
1 <= cap <= 10^3
1 <= Q <= 10^5
1 <= x, y <= 10^4
*/
import java.util.Scanner;
class LRUCache{
	int key;
	int value;
	LRUCache next=null;
	LRUCache(int key,int value){
		this.key=key;
		this.value=value;
	}
}
class Map{
	int cap;
	Map(int cap){
		this.cap=cap;
		this.head=null;
	}
	LRUCache head;
	int countNode(){
		LRUCache temp=head;
		int count=0;
		while(temp!=null){
			temp=temp.next;
			count++;
		}
		return count;
	}
	void setAdd(int key,int value){
		LRUCache newLRU= new LRUCache(key,value);
		LRUCache temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next= newLRU;
	}
	void set(int key, int value){
		LRUCache newLRU= new LRUCache(key,value);
		if(countNode()==0){
			head=newLRU;
			System.out.println("node added at first succesfully");
			return;
		}
		LRUCache temp=head;
		boolean flag=true;
		while(temp!=null){
			if(temp.key==key){
				temp.value=value;
				flag=false;
				System.out.println("value "+value+ " replaced at key "+key+" succesfully");
				break;
			}
			temp=temp.next;
		}
		if(flag==false){
			LRUCache temp1=head;
			//System.out.println(temp.key);
			//System.out.println("here2");
			if(temp1==temp){
				while(temp1.next!=null){
					temp1=temp1.next;
				}
			//	System.out.println(temp1.key);
			//	System.out.println(temp.key);
			//	System.out.println(head.key);
				head=temp.next;
				temp.next=null;
				temp1.next=temp;
				System.out.println("adter");
				//System.out.println(temp1.key);
                               // System.out.println(temp.key);
                               // System.out.println(head.key);
				return;
			}
			while(temp1.next!=temp){
				temp1=temp1.next;
			}
			//System.out.println("here1");
			temp1.next=temp.next;
			temp1=head;
			//System.out.println("here");
			while(temp1.next!=null){
				temp1=temp1.next;
                        }
			temp1.next=temp;
		}
		if(flag && countNode()==cap){
			head=head.next;
			setAdd(key,value);
			System.out.println("least recently used pair deleted");
			System.out.println("(key,value) pair added at last ");
		}
		else if(flag){
			setAdd(key,value);
			System.out.println("(key,value) pair added at last ");
		}
	}
	void attachAtLast(LRUCache node){
		LRUCache temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
	}
	int get(int key){
		boolean flag=false;
		LRUCache temp=head;
		while(temp!=null){
			if(temp.key==key){
				flag=true;
				break;
			}
			temp=temp.next;
		}
		if(temp==head && flag && countNode()!=1){
			head=head.next;
			temp.next=null;
			attachAtLast(temp);
		}
		else if(temp!=null && temp.next==null && flag){}
		else if(flag){
			LRUCache temp1=head;
			while(temp1.next!=temp){
				temp1=temp1.next;
			}
			temp1.next=temp.next;
			temp.next=null;
			attachAtLast(temp);
		}
		if(flag)
			return temp.value;
		else
			return -1;
	}
	void printM(){
		LRUCache temp=head;
		if(countNode()==0){
			System.out.println("LRUCache is empty");
			return;
		}
		System.out.println("LRUCache is: ");
		System.out.print("{ ");
		while(temp!=null){
			if(temp.next!=null)
				System.out.print(temp.key+" -> "+temp.value+" , ");
			else
				System.out.print(temp.key+" -> "+temp.value);
			temp=temp.next;
		}
		System.out.println(" }");
	}
}
class Client{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of LRUCache: ");
		Map m= new Map(sc.nextInt());
		System.out.println("LRUCache creted succesfully");
		char ch;
		do{
			System.out.println("1.set(key,value)");
			System.out.println("2.get(key)");
			System.out.println("3.countNode");
			System.out.println("4.printMap");
			System.out.println("Enter any above choice 1/2/3/4: ");
			int choice=sc.nextInt();
			switch(choice){
				case 1:
					System.out.println("Enter key to add: ");
					int key=sc.nextInt();
					System.out.println("Enter value to add with key: ");
					int value=sc.nextInt();
					m.set(key,value);
					break;
				case 2:
					System.out.println("Enter key for getting is value: ");
					int val=m.get(sc.nextInt());
					if(val==-1)
							System.out.println("Invaild key ");
					else
						System.out.println("Value of key is: "+val);
					break;
				case 3:
					System.out.println("Number of nodes in map are: "+m.countNode());
					break;
				case 4:
					System.out.println("Map is: ");
					m.printM();
					break;
				default:
					System.out.println("Plese enter vaild choice");
					break;
			}
			System.out.println("do you want to continue? ");
			ch=sc.next().charAt(0);
		}
		while(ch=='y' || ch=='Y');
	}
}




