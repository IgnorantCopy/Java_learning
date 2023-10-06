# JDK7中的HashMap源码

## 1.实例化的过程

```java
HashMap<String, Integer> map = new HashMap<>();
```

对应的源码:

```java
public HashMap() {
    this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
}
public HashMap(int initialCapacity, float loadFactor) {
    if (initialCapacity < 0)
        throw new IllegalArgumentException("Illegal initial capacity: " +
                                           initialCapacity);
    if (initialCapacity > MAXIMUM_CAPACITY)
        initialCapacity = MAXIMUM_CAPACITY;
    if (loadFactor <= 0 || Float.isNaN(loadFactor))
        throw new IllegalArgumentException("Illegal load factor: " +
                                           loadFactor);
    // Find a power of 2 >= initialCapacity
    int capacity = 1;
    while (capacity < initialCapacity)
        capacity <<= 1;
    //通过此循环,得到capacity的最终值,此最终值决定了数组的长度,此时的capacity一定是2的整数倍
    this.loadFactor = loadFactor;
    //确定了临界值
    threshold = (int)Math.min(capacity * loadFactor, MAXIMUM_CAPACITY + 1);
    table = new Entry[capacity];
    useAltHashing = sun.misc.VM.isBooted() &&
        (capacity >= Holder.ALTERNATIVE_HASHING_THERSHOLD);
    init();
}
```

其中:

```java
static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;
static final float DEFAULT_LOAD_FACTOR = 0.75f;
final float loadFactor;  //加载因子
int thershold;  //临界值
transient Entry<K, V>[] table;  //存储数组的数组
void init(){}
```

## 2.put(key, value)的过程

```java
public V put(K key, V value) {
    //HashMap允许添加key为null的值,将此(key, value)存放到table索引0的位置
    if (key == null)
        return putForNullKey(value);
    //将key传入hash(),内部使用了key的哈希值1,此方法执行结束后,返回哈希值2
    int hash = hash(key);
    //确定当前key,value在数组中的存放位置i
    int i = indexFor(hash, table.length);
    
    for (Entry<K, V> e = table[i]; e != null; e = e.next) {
        Object k;
        if (e.hash == hash && ((k = e.key) == key || key.equals(k))) {
            V oldValue = e.value;
            e.value = value;
            e.recordAccess(this);
            return oldValue;  //如果put是修改操作,会返回原有旧的value值
        }
    }
    
    modCount++;
    //将key, value封装为一个Entry对象,并将此对象保存在索引i的位置
    addEntry(hash, key, value, i);
    return null;  //如果put是添加操作,会返回null
}
```

其中:

```java
final int hash(Object k) {
    int h = 0;
    if (useAltHashing) {
        if (k instanceof String) {
            return sun.misc.Hashing.stringHash32((String) k);
        }
        h = hashSeed;
    }
    
    h ^= k.hashCode();  //一次哈希
    
    // This function ensures that hashCodes that differ only by
    // constant multiplies at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= k.hashCode();
    return h ^ (h >>> 7) ^ (h >>> 4);
}

static int indexFor(int h, int length) {
    return h & (length - 1);
}

void addEntry(int hash, K key, V value, int bucketIndex) {
    //扩容的条件
    if ((size >= threshold) && (null != table[bucketIndex])) {
        resize(2 * table.length);  //默认扩容为原来的2倍
        hash = (null != key) ? hash(key) : 0;
        bucketIndex = indexFor(hash, table.length);
    }
    
    createEntry(hash, value, bucketIndex);
}

void createEntry(int hash, K key, V value, int bucketIndex) {
    Entry<K, V> e = table[bucketIndex];
    table[bucketIndex] = new Entry<>(hash, key, value, e);
    size++;
}
```

## 3.Entry的定义

```java
static class Entry<K, V> implements Map.Entry<K, V> {
    final K key;
    V value;
    Entry<K, v> next;
    int hash;  //使用key得到的哈希值2进行赋值
    
    /**
     * Create new entry.
     */
    Entry(int h, K k, V v, Entry<K, V> n) {
        value = v;
        next = n;
        key = k;
        hash = h;
    }
}
```



