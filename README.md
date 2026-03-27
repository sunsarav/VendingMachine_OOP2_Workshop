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
