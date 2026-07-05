mini java payment project

A common real-world design in Java is to combine an interface, an abstract class, and concrete classes.

Interface       → Defines what must be done.
Abstract class  → Provides common implementation and shared data.
Concrete class  → Provides the specific behavior.
--------------------------------------------------------------------------
Interface (Payment)
    Defines the contract: every payment must implement pay().

Abstract class (BasePayment)
    Shares common code (accountName, receipt(), printAccount()).
    Avoids code duplication.

Concrete classes
    Implement payment-specific logic.

This pattern is very common in enterprise Java (for example, in frameworks such as Spring) 
because it combines the flexibility of interfaces with the code reuse of abstract classes.
--------------------------------------------------------------------------