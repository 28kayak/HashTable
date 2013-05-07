
public abstract  class AbstractHashTable<K, V>
{
	static class Entry<K,V>
	{
		public K key;
		public V value;
		public Entry(K key, V value)
		{
			this.key = key;
			this.value = value;
		}//Constructor 
	}//class Entry
	
	public abstract int size();
	public abstract void insert();
	public abstract V find();
	public abstract void remove();
	
	//Must pay attention to avoid collision.
	//Hash function is never like  function.  
	// y cannot be +- x　＝＝＞　collision 
}
