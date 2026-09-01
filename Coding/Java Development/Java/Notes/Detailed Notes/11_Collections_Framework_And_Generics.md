# Variable Arguments
- varargs, can accept any number of arguments, declared with ellipsis(...), internally treated as array
- must be placed at the last of parameters, can call using any number of arguments
- Introduced in Java 5

# Wrapper Classes and Autoboxing
- Object ---> Number(Byte, Short, Integer, Long, Float, Double), Boolean, Character, wrapper classes
- Can use primitive types as objects of its wrapper class, automatic conversion between them, once created can't be changed, allows to assign null values to primitive
- Utility Methods -> compareTo, valueOf, parseInt etc
- required to store primitives in collection objects
- Autoboxing -> automatic conversion of primitive to its wrapper class object
- Upboxing -> automatic conversion of wrapper class objects to primitive

# Collections Framework or Collections Library
- Collection(interface) -> List, Queue, Set :- All are interface
- List -> ArrayList, Vector, LinkedList :- All are classes
- Queue -> LinkedList(Multiple inheritance with interfaces), PriorityQueue :- All are classes
- Set -> HashSet, LinkedHashSet :- are classes and SortedSet (interface) -> TreeSet(Class)
- Map interface is not a part of Collection interface  
- Map -> HashTable, HashMap :- are classes and SortedMap (interface) -> TreeMap(Class)

- Collection Interface -> root interface of collection hierarchy, declares basic operations like add, remove, clear, size
    1. List Interface -> Ordered collection, can contain duplicate elements
    2. Set Interface -> can not contain duplicate elements
    3. Queue Interface -> used for holding elements in FIFO prior to processing
- Map Interface -> Not a true collection, but part of Collections Framework, store value in key-value pair. Keys are unique, but different keys can map same value

## List Interface
- an ordered collection (sequence), allows duplicate elements
- elements can access by integer index, maintains insertion order of elements
- offers fast random access and quick iteration
- capacity grows automatically as elements are added
- preferred over arrays when size is dynamic or unknown
- Methods: 
    1. add(E e) - add specific element
    2. add(int index, E element) - insert at specific position
    3. remove(Object o) - removes first occurrence of specific element
    4. remove(int index) - removes element of specified position
    5. get(int index) - returns element at the specified position
    6. set(int index, E element) - replace element at specified position
    7. size() - returns number of elements
    8. clear() - removes all the elements
    9. contains(Object o) - returns true if list contains specified element
    10. indexOf(Object o) - return the index of first occurrence of specified element, otherwise -1 if not in list

## Queue Interface
- collection design for holding elements prior to processing, ordering elements in FIFO manner
- two end points: for insertion(tail) and removal(head)
- Methods:
    1. add(E e) - insert specified element, throws exception if couldn't
    2. offer(E e) - insert specified element, return false if couldn't
    3. remove() - retrieves and remove the head of queue, throws exception if couldn't
    4. poll() - retrieves and remove the head of queue, returns null if couldn't
    5. element() - retrieves but doesn't remove the head of queue, throws exception if couldn't
    6. peek() - retrieves but doesn't remove the head of queue, return null if couldn't

## Set Interface
- doesn't allow duplicate, all unique elements
- unordered collection, doesn't guarantee any specific ordering
- doesn't support indexing-based access
- Method: 
    1. add(E e) - adds specified element
    2. remove(Object o) - removes specified element
    3. contains(Object o) - checks if the set contain specified element
    4. size() - returns the number of elements in set
    5. isEmpty() - checks if the set is empty

## Collections Class
- Provides different methods
- sort() - to sort list
- binarySearch() - for searching sorted list
- reverse() - reversing order of elements of list
- shuffle() - randomly shuffle elements of list
- unmodifiableList() - to make the collections unmodifiable
- singletonList() - creates immutable collections with single elements
- copy() - copy all elements from one list to another