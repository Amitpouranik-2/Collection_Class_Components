package com.thinking.machines.util;

public class MyArrayList<T> implements MyList<T>
{
private Object collection [];
private int size; 

public MyArrayList()
{
this.collection = new Object [10];
this.size = 0;
}


public T RemoveAt(int index)
{
if( index < 0 || index > this.size) throw new IndexOutOfBoundsException("Invalid Index :" + index);
T data = (T)this.collection[index];
int ep = this.size-2;

for(int e=0; e<=ep ;e++)
{
this.collection[e] = this.collection[e+1];
}
this.size--;
return data;
}


public void Add( T data)
{
if(this.size == collection.length)
{
Object []tmp = new Object[this.size+10];
for(int e=0; e<this.size; e++) tmp[e] = this.collection[e];
this.collection = tmp;
}
this.collection[this.size] = data;
this.size++;
}
public void Add( int index , T data)
{

if(index < 0 || index > this.size) throw new IndexOutOfBoundsException("Invalid Index :" + index);

if(this.size == collection.length)
{
Object []tmp = new Object[this.size +10];
for(int e=0; e<this.size; e++) tmp[e] = this.collection[e];
this.collection = tmp;
}

for(int e=this.size; e> index ; e--)
{
this.collection[e] = this.collection[e-1];
}
this.collection[index] = data; 
this.size++;
}
public void Insert( int index , T data)
{
Add( index , data );
}
public void RemoveAll(int index)
{
Clear();
}
public  void Clear()
{
this.size =0;
}

public T Get(int index)
{
if( index < 0 || index > this.size) throw new IndexOutOfBoundsException("Invalid index :" + index);

return (T)this.collection[index];
}
public int size()
{
return this.size;
}

public void Update( int index , T data)
{
if(index < 0 || index > this.size) throw new IndexOutOfBoundsException("Invalid index :" + index);
 this.collection[index] = data;
}

public void CopyTo(MyList<T>  other)
{
other.Clear();
for(int i=0; i<this.size(); i++) other.Add(this.Get(i));
}
public void CopyFrom(MyList<T> other)
{
this.Clear();
for(int i=0; i<other.size(); i++) this.Add(other.Get(i));
}

public void AppendTo(MyList<T> other)
{
for(int i=0; i<this.size(); i++) other.Add(this.Get(i));
}
public void AppendFrom(MyList<T> other)
{
for(int i=0; i<other.size(); i++) this.Add(other.Get(i));
}

public class MyArrayListIterator<T> implements MyIterator<T>
{
private int index;
public MyArrayListIterator()
{
this.index = 0;
}
public boolean HasNext()
{
return index != size;
}
public T next()
{
if(index == size ) throw new InvalidIteratorException("Iterator has no more Elements");

T data = (T)Get(index);
index ++;
return data;
}
}

public MyIterator<T> iterator()
{
return new MyArrayListIterator<T>();
}


public void ForEach(MyListItemAcceptor<T> a)
{
if(a== null) return ;
for( int e=0; e<this.size; e++) a.Accept((T)collection[e]);
}
};