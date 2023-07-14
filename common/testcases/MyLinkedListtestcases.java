import com.thinking.machines.util.*;
class MyLinkedListTestcase 
{
public static void main (String gg[])
{

MyLinkedList list1  = new MyLinkedList();
list1.Add(100);
list1.Add(200);
list1.Add(45);
for(int i=0; i<list1.size(); i++) System.out.println(list1.Get(i));

System.out.println("---------------------------------------------------------------------------------------------------");

System.out.println("After Inserting");
list1.Insert(0 , 56);
list1.Insert(2 , 45);
list1.Insert(4 , 345);
for(int i=0; i<list1.size(); i++) System.out.println(list1.Get(i));

System.out.println("---------------------------------------------------------------------------------------------------");

}
}