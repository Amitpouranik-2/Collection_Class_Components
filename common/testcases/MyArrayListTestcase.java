import com.thinking.machines.util.*;
class MyArrayListTestcase 
{
public static void main (String gg[])
{
MyArrayList list1  = new MyArrayList();
list1.Add(10);
list1.Add(200);
list1.Add(45);
for(int i=0; i<list1.size(); i++) System.out.println(list1.Get(i));

System.out.println("____________________________________________________________________");

MyArrayList list2  = new MyArrayList();
list2.Add( 0, 23);
list2.Add(1 ,34);
list2.Add(2 , 45);
//list2.Insert(2 , 44 );
list2.Update(2 , 23);
for(int i=0; i<list2.size(); i++) System.out.println(list2.Get(i));

System.out.println("____________________________________________________________________");

MyArrayList list3  = new MyArrayList();
list1.CopyTo(list2);
for(int i=0; i<list2.size(); i++) System.out.println(list2.Get(i));

System.out.println("____________________________________________________________________");


list1.AppendTo(list2);
for(int i=0; i<list2.size(); i++) System.out.println(list2.Get(i));

}
}