# Exercise ex03

How to run:
```bash
cd src
javac Demo03.java.java
java Demo03
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

SOLID Violations in Original Code

1. Single Responsibility Principle (SRP), . Interface Segregation Principle (ISP) and Open/Closed Principle (OCP):

    ShippingCostCalculator has multiple if-else cases to find which is the correct calculator for a the specific shipment type. it throws exception if it doesn't have the type which breaks the code.

    **Fixed:** created ShippingCostCalculator interface and implemented each classes for each type.


4. Other Principles:

    **Liskov Substitution Principle (LSP)** has already satisfied in this design.

