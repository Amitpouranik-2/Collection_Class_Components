package com.thinking.machines.util;

public class MyLinkedList<T> implements MyList<T>
{

class My_Node<T>
{
public  T data;
public  My_Node<T> next;
My_Node()
{
this.data =null;
this.next = null;
}
}

private My_Node<T> start , end;
private int size;
public MyLinkedList()
{
this.start = null;
this.end = null;
this.size =0;
}
public void Add( T data)
{
My_Node<T> t = new My_Node<T>();
t.data = data;
if(this.start == null)
{
this.start = t;
this.end =t;
}
else
{
this.end.next =t;
end =t;
}
this.size++;
}


public void Add(int index , T data)
{
Insert( index , data);
}
public void Insert(  int index , T data)
{
if(index <0) throw new ArrayIndexOutOfBoundsException("Invalid Index : "+ index);

if(index >= size)
{
Add(data);
return;
}

My_Node<T> node = new My_Node<T>();

node.data = data;

if(index == 0)
{
node.next = this.start;
this.start = node;
}
else
{
My_Node<T>  j,k;
int i;
i=0;
k = null;
j= this.start;
while(i< index)
{
k= j;
j= j.next;
i++;
}
k.next =node;
node.next = j;
}
this.size++;
}

public void RemoveAll(int index)
{
this.Clear();
}
public T RemoveAt(int index)
{
if(index < 0 || index >= this.size) throw  new ArrayIndexOutOfBoundsException("Invalid index :"+ index);
T data;
if( start == end)
{
data = this.start.data;
this.start = null;
this.end = null;
this.size =0;
return data;
}
if(index == 0)
{
data = this.start.data;
this.start = this.start.next;
this.size--;
return data;
}
My_Node<T> j,k;
k= null;
int i;
i=0;
j= this.start;
while(i <index)
{
k=j;
j= j.next;
i++;
}
data = j.data;
k.next = j.next;
if(this.end == j) this.end = k;
this.size--;
return data;
}
public  void Clear()
{
this.size = 0;
this.start = null;
this.end = null;
}

public T Get(int index)
{
if(index < 0 || index > this.size ) throw new ArrayIndexOutOfBoundsException("Invalid Index : " + index);
 
int x;
x=0;
My_Node<T> t;
t= this.start ;
while(x < index)
{
t =t.next;
x++;
}
return t.data;
}

public int size()
{
return this.size;
}

public void Update( int index , T data)
{
if(index < 0 || index >=this.size) throw new ArrayIndexOutOfBoundsException("Invalid index :" + index);

if(index == 0)
{
this.start.data = data;
return;
}

if(index == this.size-1)
{
this.end.data = data;
return;
}
My_Node<T>  j;
int i;
i=0;
j = this.start;
while(i < index)
{
j= j.next;
i++;
}
j.data = data;
}
public void CopyTo(MyList<T>  other)
{
other.Clear();
for(int e=0; e<this.size(); e++) other.Add(this.Get(e));
}
public void CopyFrom(MyList<T> other)
{
this.Clear();
for(int e=0; e<other.size(); e++) this.Add(other.Get(e));
}

public void AppendTo(MyList<T> other)
{
for(int e=0; e<this.size(); e++) other.Add(this.Get(e));
}

public void AppendFrom(MyList<T> other)
{
for(int e=0; e<other.size(); e++) this.Add(other.Get(e));
}

public class MyLinkedListIterator<T> implements MyIterator<T>
{
private My_Node<T> ptr;
public MyLinkedListIterator(My_Node<T> ptr)
{
this.ptr = ptr;
}
public boolean HasNext()
{
return this.ptr != null;
}
public  T next()
{
if(ptr == null) throw new InvalidIteratorException(" iterator has no more Element ");
T data  = this.ptr.data;
this.ptr = this.ptr.next;	
return data; 
}
}


public MyIterator<T> iterator()
{
return new MyLinkedListIterator<T>(this.start);
}



public void ForEach(MyListItemAcceptor<T> a)
{
My_Node<T> t;
for(t=start; t!= null; t= t.next) a.Accept(t.data);
}

}