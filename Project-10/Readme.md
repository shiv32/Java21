Java does not support user-defined operator overloading.
Unlike C++, you cannot redefine operators such as +, -, *, ==, or [] for your own classes.
In Java, you must use methods instead.

Why Java doesn't allow it
    The designers of Java chose not to include operator overloading because they wanted:
        Simpler and more readable code.
        Consistent behavior of operators.
        Fewer opportunities for confusing or misleading code.

One exception
Java does have a built-in special case:

    String s = "Hello " + "World";
    String s2 = "Age: " + 25;

The + operator works with String, but this is built into the language by the compiler. 
You cannot make + work for your own classes.