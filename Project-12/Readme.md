Java records (introduced in Java 16) provide a concise way to create immutable data classes.

Basic Record Example

    public record Person(String name, int age) {
    }

This single line automatically generates:
    Private final fields: name, age
    Constructor
    Getter methods (name(), age())
    equals()
    hashCode()
    toString()

Records are ideal for 
DTOs, 
API responses, 
request objects, 
configuration objects, 
and other immutable data holders.