import com.thinking.machines.util.*;
class MyiteratorTestcase 
{
public static void main (String gg[])
{
MyLinkedList list1 = new MyLinkedList();
list1.Add(100);
list1.Add(200);
list1.Add(300);
list1.Add(4900);
list1.Add(4567);

MyArrayList list2  = new MyArrayList();

list2.Add(456);
list2.Add(234);
list2.Add(5678);
list2.Add(678);

System.out.println("Iterating Linked List :");

MyIterator iterator1 = list1.iterator();
int x;
while(iterator1.HasNext())
{
x= iterator1.next();
System.out.println(x);
}
System.out.println("Iterating Array List");
MyIterator iterator2 = list2.iterator();

while(iterator2.HasNext())
{
x = iterator2.next();
System.out.println(x);
}
}
}