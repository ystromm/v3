In this exercise you'll be writing code to keep track of international dialling codes via an international dialing code dictionary.

The dictionary uses an integer for its keys (the dialing code) and a string (country name) for its values.

You have 9 tasks which involve the `DialingCodes` class.

### 1. Create a new dictionary

Implement the (static) method `DialingCodes.getEmptyMap()` that returns an empty dictionary.

```java
DialingCodes.getEmptyMap();
// => empty dictionary
```

### 2. Create a pre-populated dictionary

There exists a pre-populated dictionary which contains the following 3 dialing codes: "United States of America" which has a code of 1, "Brazil" which has a code of 55 and "India" which has a code of 91. Implement the (static) `DialingCodes.getExistingMap()` method to return the pre-populated dictionary:

```java
DialingCodes.getExistingMap();
// => 1 => "United States of America", 55 => "Brazil", 91 => "India"
```

### 3. Add a country to an empty dictionary

Implement the (static) method `DialingCodes.addCountryToEmptyMap()` that creates a dictionary and adds a dialing code and associated country name to it.

```java
DialingCodes.addCountryToEmptyMap(44, "United Kingdom");
// => 44 => "United Kingdom"
```

### 4. Add a country to an existing dictionary

Implement the (static) method `DialingCodes.addCountryToExistingMap()` that adds a dialing code and associated country name to a non-empty dictionary.

```java
DialingCodes.addCountryToExistingMap(DialingCodes.getExistingMap(),
  44, "United Kingdom");
// => 1 => "United States of America", 44 => "United Kingdom", 55 => "Brazil", 91 => "India"
```

### 5. Get the country name matching a dialing code

Implement the (static) method `DialingCodes.getCountryNameFromMap()` that takes a dialing code and returns the corresponding country name. If the dialing code is not contained in the dictionary then an empty string is returned.

```java
DialingCodes.getCountryNameFromMap(
  DialingCodes.getExistingMap(), 55);
// => "Brazil"

DialingCodes.getCountryNameFromMap(
  DialingCodes.getExistingMap(), 999);
// => string.Empty
```

### 6. Check that a country exists in the dictionary

Implement the (static) method `DialingCodes.checkCodeExists()` to check whether a dialing code exists in the dictionary.

```java
DialingCodes.checkCodeExists(DialingCodes.getExistingMap(), 55);
// => true
```

### 7. Update a country name

Implement the (static) method `DialingCodes.updateMap()` which takes a dialing code and replaces the corresponding country name in the dictionary with the country name passed as a parameter. If the dialing code does not exist in the dictionary then the dictionary remains unchanged.

```java
DialingCodes.updateMap(
  DialingCodes.getExistingMap(), 1, "Les États-Unis");
// => 1 => "Les États-Unis", 55 => "Brazil", 91 => "India"

DialingCodes.updateMap(
  DialingCodes.getExistingMap(), 999, "Newlands");
// 1 => "United States of America", 55 => "Brazil", 91 => "India"
```

### 8. Remove a country from the dictionary

Implement the (static) method `DialingCodes.removeCountryFromMap()` that takes a dialing code and will remove the corresponding record, dialing code + country name, from the dictionary.

```java
DialingCodes.removeCountryFromMap(
  DialingCodes.getExistingMap(), 91);
// => 1 => "United States of America", 55 => "Brazil"
```

### 9. Find the country with the longest name

Implement the (static) method `DialingCodes.findLongestCountryName()` which will return the name of the country with the longest name stored in the dictionary.

```java
DialingCodes.findLongestCountryName(
  DialingCodes.getExistingMap());
// => "United States of America"
```
