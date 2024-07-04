public class Product {
  //fields
  private String ID;

  private String name;

  private Double price;

  private int quantity;

  

  public Product(String iD, String name, Double price, int quantity) {
    ID = iD;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  public String getID() {
    return ID;
  }

  public void setID(String iD) {
    ID = iD;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  @Override
  public String toString() {
    return String.format("Product ID: %s, Product Name: %s, Product Price: %s, Product Quantity: %s", ID, name, price, quantity);
  }

  

  
}
