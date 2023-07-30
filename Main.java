import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {
  public static void main(String[] args) {
    // Shirt shirt = new Shirt();
    // shirt.setSize(Size.SMALL);
    // shirt.setBrand("Nike");
    // shirt.setPrice(49.99);
    // shirt.setColor("Blue");
    // shirt.fold();
    // productStore(shirt);

    // Show this code below in debug without shirt constructor for error
    Shirt shirt = new Shirt(11.99, "Red", "Nike", Size.SMALL);
    shirt.fold();
    productStore(shirt);

    // Pants pants = new Pants();
    // pants.setWaist(32);
    // pants.setLength(32);
    // pants.setColor("Green");
    // pants.setPrice(80.88);
    // pants.setBrand("Penguin");
    // pants.fold();
    // productStore(pants);

    Pants pants = new Pants(49.99, "Black", "lulu", 32, 32);
    pants.fold();
    productStore(pants);
  }

  public static void pantStore(Pants pants) {
    System.out.println(
        "Thank you for purchasing " + pants.getBrand() + " Pants. " + "Your total comes to " + pants.getPrice());
  }

  public static void shirtStore(Shirt shirt) {
    System.out.println(
        "Thank you for purchasing " + shirt.getBrand() + " Shirt. " + "Your total comes to " + shirt.getPrice());
  }

  public static void productStore(Product product) {
    System.out.println(
        "Thank you for purchasing the " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase()
            + ". "
            + "Your total comes to " + product.getPrice());
  }

}
