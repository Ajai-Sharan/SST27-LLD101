# Exercise ex09

How to run:
```bash
cd src
javac Demo09.java.java
java Demo09
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

### SOLID Principle Violations and Fixes
**Single Responsibility Principle (SRP), Open/Closed Principle (OCP) and Interface Segregation Principle (ISP)**

OrderController handles multiple functions. OrderController depends on concrete class SqlOrderRepository and there can be any number of OrderRepository.

Fix: Created OrderRepository interface and made it implemented by SqlOrderRepository and injected in OrderController.