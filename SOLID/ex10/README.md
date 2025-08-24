# Exercise ex10

How to run:
```bash
cd src
javac Demo10.java.java
java Demo10
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

### SOLID Principle Violations and Fixes
**Single Responsibility Principle (SRP), Open/Closed Principle (OCP) and Interface Segregation Principle (ISP)**

ReportService handles multiple functions. ReportService depends on concrete class ConsoleLogger and there can be any number of Logger.

Fix: Created ReportService interface and made it implemented by ConsoleLogger and injected in OrderController.