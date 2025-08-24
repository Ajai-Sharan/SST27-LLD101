# Exercise ex01

How to run:
```bash
cd src
javac Demo01.java.java
java Demo01
```

Tasks:
- Identify the SOLID violation(s)
- Refactor to comply with all SOLID principles
- Keep behavior; add a tiny demo/test

SOLID Violations in Original Code

1. Single Responsibility Principle (SRP):

    OrderService handled calculation, email sending, and order storage.

    **Fixed:** Split into OrderCalculator, OrderRepository, and OrderService.

2. Dependency Inversion Principle (DIP):

    OrderService depended directly on concrete EmailClient.

    **Fixed:** Introduced EmailService interface and used SmtpEmailClient.

3. Open/Closed Principle (OCP):

    Adding a new notification type would require modifying OrderService.
    
    **Fixed:** Using EmailService interface; can now extend without modifying OrderService.

4. Other Principles:

    **Liskov Substitution Principle (LSP)** and **Interface Segregation Principle (ISP)** are already satisfied in this design.
