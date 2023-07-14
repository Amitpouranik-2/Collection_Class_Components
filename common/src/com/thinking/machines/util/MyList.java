package  com.thinking.machines.util;
public interface MyList<T>
{

public void Add( T data);
public void Add(int index , T data);
public void Insert(int index , T data);

public void RemoveAll(int index);
public T RemoveAt(int index);
public  void Clear();

public T Get(int index);
public int size();

public void Update( int index , T data);

public void CopyTo(MyList<T>  other);
public void CopyFrom(MyList<T> other);

public void AppendTo(MyList<T> other);
public void AppendFrom(MyList<T> other);

public  MyIterator<T> iterator();

public void ForEach(MyListItemAcceptor<T> a);


}