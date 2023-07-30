package product;

public class Product {
  private double price;
  private String color;
  private String brand;

  // Leave out this contructor at first.
  // Copy over these parameters and put them in Pants & Shirt constructor.
  public Product(double price, String color, String brand) {
    this.price = price;
    this.color = color;
    this.brand = brand;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getColor() {
    return this.color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getBrand() {
    return this.brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  // Define a method next that every child will automatically inherit
  public void fold() {
    System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
  }

}
