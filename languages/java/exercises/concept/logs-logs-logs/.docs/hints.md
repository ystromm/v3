## General

- [Tutorial on working with enums][https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html].

## 1. Parse log level

- There is a [method to get a part of a string](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int,%20int)).
- You can use a [`switch` statement](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html) to elegantly handle the various log levels.

## 2. Support unknown log level

- There is a special switch case that can be used to catch unspecified cases.

## 3. Convert log line to short format

- One can introduce a field in the enum to assign specific values to enum members.

