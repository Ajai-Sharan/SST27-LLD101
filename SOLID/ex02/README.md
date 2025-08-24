# Exercise ex02

How to run:
```bash
cd src
javac Demo02.java.java
java Demo02
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

SOLID Violations in Original Code

1. Single Responsibility Principle (SRP):

    Player handled decoding, drawing ui and caching.

    **Fixed:** Split into UI and Cache.

2. Open/Closed Principle (OCP):

    Adding a new UI and Caching technique would require modifying Player.
    
    **Fixed:** Using UI and Cache interface; can now extend without modifying Player.

4. Other Principles:

    **Liskov Substitution Principle (LSP)** and **Interface Segregation Principle (ISP)** are already satisfied in this design.
