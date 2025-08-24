# Exercise ex07

How to run:
```bash
cd src
javac Demo07.java.java
java Demo07
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

### SOLID Principle Violations and Fixes

**Single Responsibility Principle (SRP), Open/Closed Principle (OCP) and Interface Segregation Principle (ISP)**
Scan and fax methods is throwing error as the BasicPrinter doesn't have those features and it will break the code. 

Fix: create separate interface such as Printable, Scannable and Faxble and implemented in the wherever required.