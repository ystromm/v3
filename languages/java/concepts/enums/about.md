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
It is also possible to have fields and methods:

```java
enum Answer
{
    MAYBE("Perhaps"),
    YES("Certainly"),
    NO("No way");

    Answer(String description) {
        this.description = description;
    }

    private final String description;

    String getDescription() {
        return description;
    }
}
```

Java enums can  not be extended and the constructor is not available for outside use.


