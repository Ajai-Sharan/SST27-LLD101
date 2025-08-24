# Exercise ex05

How to run:
```bash
cd src
javac Demo05.java.java
java Demo05
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test


SOLID Violations and Fixes
1. Single Responsibility Principle (SRP), Open/Closed Principle (OCP), Interface Segregation Principle (ISP)

Violation:

The Demo05.areaAfterResize() method uses instanceof checks to decide how to resize a shape.

This makes the client responsible for the resizing logic, violating SRP.

Adding a new shape (e.g., Circle) requires modifying Demo05, violating OCP.

No proper abstraction exists for resizing, which leads to ISP violation.

Fix:

Created a Shape interface with area() and resize() methods.

Each shape (Rectangle, Square) implements its own resizing logic.

Demo05 now only depends on the Shape abstraction, not on specific shape types.

2. Liskov Substitution Principle (LSP)

Violation:

In the original code, Square extends Rectangle but behaves differently.

When resizing a Square via setWidth() and setHeight(), it breaks the expected behavior of a Rectangle.

This violates LSP because Square is not truly substitutable for Rectangle.

Fix:

Removed inheritance between Square and Rectangle.

Both now independently implement the Shape interface.

This ensures substitutability without breaking behavior.

3. Dependency Inversion Principle (DIP)

Violation:

Demo05 depends directly on concrete classes (Rectangle, Square).

This makes the code harder to extend and test.

Fix:

Demo05 now depends only on the Shape abstraction.

New shapes can be added without modifying Demo05.