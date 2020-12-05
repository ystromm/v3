A [list][list-interface] is an ordered collection that may contain duplicate items.

A list is created by constructing one of the classes that implements the List interface.
The most commonly used implementation is ArrayList:
```java
List aList = new ArrayList();
```


```java
String[] strings = new String[] {"a", "b", "c", "d"};
List aList = Arrays.asList(strings);
```
Adding a single item can be done using the add method:

````java
aList.add("A");
````
It is possible to add all items from another list with the addAll-method:
````java
List aList = new ArrayList();
aList.add("A");
List bList = new ArrayList();
bList.add("B");
bList.add("C");
aList.addAll(bList);
````

[list-interface]: https://docs.oracle.com/javase/tutorial/collections/interfaces/list.html

