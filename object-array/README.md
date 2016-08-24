# Object Array 

You need to write a function that takes an array of integers and returns an array of a new type of object that you will create the class for. 

1. Create a new class in the `learnsomejava` package called `ObjectDoubler`
2. Add a method (accessible from within the package) called `setNumber()` that stores a number in a class variable.
2. Add a method (accessible from within the package) called `getMeDoubled()` that returns the number doubled.
3. In the `Learn` class create a `static method` (Google it) called `createDoublers` that takes an array of integers, returns an array of `ObjectDoubler` classes, one for each integer with the `setNumber` method called with the next number in the array. 

e.g. 

Doing the following
```java
int[] numArray = {1, 2, 3, 4, 5};
Learn.createDoublers(numArray);
```

will create an array of `ObjectDoubler` objects which calling `getMeDoubled()` on would return 1, 4, 6, 8, 10. 

Look at the Test.java class for examples.
