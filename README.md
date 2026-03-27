# 🍫 Vending Machine - OOP Exercise

A Java-based Vending Machine application designed to demonstrate the core principles of **Object-Oriented Programming**

## 🚀 Features
*   **Abstraction**: Uses an `IVendingMachine` interface and an abstract `Product` class to define system behavior.
*   **Inheritance**: Specific products like `Snack`, `Beverage`, and `Fruit` extend the base `Product` class.
*   **Polymorphism**: Different products provide their own details via overridden `getDescription()` methods.
*   **Encapsulation**: Private fields with public getters/setters protect the internal state of the machine and products.
*   **Unit Testing**: Robust business logic verified with **JUnit 5** test cases.

## 🛠️ How to Run
1.  **Clone the repository**:
    ```bash
    git clone [YOUR_REPOSITORY_URL]
    ```
2.  **Build the project** (using Maven):
    ```bash
    mvn package
    ```
3.  **Run the JAR file**:
    ```bash
    java -jar target/VendingMachine_OOP2_Workshop-1.0-SNAPSHOT.jar
    ```
## 📊 Class Diagram
```mermaid
classDiagram
    class IVendingMachine {
        <<interface>>
        +insertCoin(coin: int) void
        +getBalance() int
        +purchaseProduct(productId: int) Product
        +returnChange() int
        +getProducts() List~Product~
    }

    class Product {
        <<abstract>>
        -int id
        -String name
        -int price
        -int quantity
        +getDescription() String
    }

    class Snack {
        -boolean isGlutenFree
        -double netWeight
        -int caloriesPerServing
        +getDescription() String
    }

    class Beverage {
        -int volume
        -boolean isCarbonated
        -double sugarContent
        +getDescription() String
    }
    
    class Fruit {
        -int weightPerPiece
        -String ripeness
        +getDescription() String
    }

    class VendingMachineImpl {
        -List~Product~ products
        -int balance
        +VendingMachineImpl()
        +insertCoin(coin: int) void
        +getBalance() int
        +getProducts() List~Product~
        +purchaseProduct(productId: int) Product
        +returnChange() int
    }

    class ConsoleUI

    %% Relationships
    Product <|-- Snack : Inheritance
    Product <|-- Beverage : Inheritance
    Product <|-- Fruit : Inheritance
    IVendingMachine <|.. VendingMachineImpl : Implements
    VendingMachineImpl --> Product : Manages
    ConsoleUI ..> IVendingMachine : Uses
    ```


