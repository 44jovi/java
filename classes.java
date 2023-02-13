// Simple Java class example:

class Product {
  int price;
  int getPrice() { // getter
    return price;
  }
  // 'void' keyword specifies that a method should not have a return value
  void setPrice(int newPrice) { // setter
    price = newPrice
  }
}

// A public class is accessible by any other class within a Java package

public class Main {
  int x = 5;

  public static void main(String[] args) {
    Main object1 = new Main();
    System.out.printIn(object1).x;
  }
}
