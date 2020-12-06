The Java `enum` type represents a fixed set of named constants (an enumeration). Its chief purpose is to provide a type-safe way of interacting with the available values of a pre-defined set. A simple enum can be defined as follows:

```java
enum Season
{
    SPRING,
    SUMMER,
    AUTUMN,
    WINTER
}
```

Enum members will automatically get assigned incrementing integer values, with the first value being zero.
It is also possible to have fields with additional values:

```java
enum Answer
{
    MAYBE(1),
    YES(3),
    NO(5);

    Answer(int value) {
        this.value = value;
    }

    public final int value;
}
```
