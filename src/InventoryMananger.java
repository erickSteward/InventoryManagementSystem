import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class InventoryMananger {

  private Map<String, Product> inventory;

  private List<Sale> salesHistory;

  private Scanner scanner;

  public InventoryMananger() {
    this.inventory = new HashMap<>();
    this.salesHistory = new ArrayList<>();
    this.scanner = new Scanner(System.in);
  }

  public void run() {
    while (true) {
      System.out.println("---------------Inventory Management System---------------");
      System.out.println("1. Add new Product");
      System.out.println("2. Add Update Product Quantity.");
      System.out.println("3. View all Products");
      System.out.println("4. Process Sale");
      System.out.println("5. View Low stoct Product.");
      System.out.println("6. View sales Report");
      System.out.println("7. Exit");
      System.out.print("Enter your choice: ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          addProductMenu();
          break;
        case 2:
          updateProductQuantityMenu();
          break;
        case 3:
          viewAllProucts();
          break;
        case 4:
          processSaleMenu();
          break;
        case 5:
          viewLowStockProducts();
          break;
        case 6:
          viewSalesReport();
          break;
        case 7:
          System.out.println("Thank you for using Inventory Management System, Good Bye!");
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  //A method to create a new Product
  public void addProductMenu(){
    System.out.println("Enter product ID: ");
    String id = scanner.nextLine();
    System.out.println("Enter product name: ");
    String name = scanner.nextLine();
    System.out.println("Enter product Price: ");
    double price = scanner.nextDouble();
    System.out.println("Enter product Quantity: ");
    int quantity = scanner.nextInt();


    Product product = new Product(id, name, price, quantity);
    inventory.put(id, product);
    System.out.println("Product Added successfully!");
  
  }

  //A method to updated a product quantity
  public void updateProductQuantityMenu(){
    System.err.print("Enter Product menu: ");
    String id = scanner.nextLine();
    Product product = inventory.get(id);

    if (product == null) {
      System.out.println("Product not Found");
      return;
    }

    System.out.println("Current Quantity: " + product.getQuantity());
    System.out.print("Enter new Quantity");
    int newQuantity = scanner.nextInt();

    product.setQuantity(newQuantity);
    System.out.println("Quantity Updated Successfully.");
  }

  //A method for viewing products
  public void viewAllProucts(){
    if (inventory.isEmpty()) {
      System.out.println("No Product in inventory.");
      return;
    }

    for(Product product : inventory.values()){
      System.out.println(product);
    }
  }

  //A method to Process a sale
  public void processSaleMenu(){
    Map<String, Integer> saleItems = new HashMap<>();
    while (true) {
      System.out.print("Enter Product ID (or 'done' to Finish):  ");
      St
    }
  }

}
