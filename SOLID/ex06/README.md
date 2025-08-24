# Exercise ex06

How to run:
```bash
cd src
javac Demo06.java.java
java Demo06
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test


### SOLID Principle Violations and Fixes

1. **Single Responsibility Principle (SRP), Interface Segregation Principle (ISP), Liskov Substitution Principle (LSP), and Open/Closed Principle (OCP):**

   - **Problem:**  
     In the original design, `Penguin` inherits from `Bird` and gets a `fly()` method.  
     However, penguins cannot fly — calling `penguin.fly()` would either throw an error or give incorrect behavior.  
     This violates:
       - **LSP:** because `Penguin` cannot fully substitute for `Bird`.  
       - **ISP & OCP:** since clients are forced to depend on the `fly()` method even when some birds don’t support it.  
       - **SRP:** because the `Bird` class is handling both “being a bird” and “flying ability.”

   - **Fix:**  
     Create a separate `Flyable` interface.  
     - Only birds that can actually fly will implement `Flyable`.  
     - `Bird` itself should only contain properties and behaviors common to all birds.  
     - This way, `Penguin` won’t have a `fly()` method at all, preventing misuse.

