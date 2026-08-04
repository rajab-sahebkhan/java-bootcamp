package ShoppingCartSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoppingCart {

    private ArrayList<Product> products = new ArrayList<>();
    private HashMap<String, Integer> cart = new HashMap<>();


    public void addProduct(int id, String name, int price, int stock){
        Product product = new Product(id, name, price, stock);
        products.add(product);
    }

    public void addToCart(String productName, int quantity){
        if(products.isEmpty()){
            System.out.println("The product list is empty.");
            return;
        }

        for(Product product: products){
            if(productName.equalsIgnoreCase(product.getName())){
                if(quantity <= product.getStock()){
                    cart.put(productName, cart.getOrDefault(productName, 0) + quantity);
                    product.setStock(product.getStock() - quantity);
                    System.out.println("Added to cart.");
                } else{
                    System.out.println("There is/are only " + product.getStock() + " item/s available in stock.");
                }
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void removeFromCart(String productName){

        if(cart.isEmpty()){
            System.out.println("Cart is empty.");
            return;
        }

        for(Product product: products){
            if(productName.equalsIgnoreCase(product.getName())){
                if(cart.containsKey(productName)){
                    int quantity = cart.get(productName);
                    product.setStock(product.getStock() + quantity);
                    cart.remove(productName);
                    System.out.println("Removed from cart.");
                } else{
                    System.out.println("Product is not in the cart.");
                }
                return;
            }
        }
        System.out.println("Product not found in the list.");
    }

    public void searchProduct(String name){
        if(products.isEmpty()){
            System.out.println("The product list is empty.");
            return;
        }

        for(Product product : products){
            if(name.equalsIgnoreCase(product.getName())){
                System.out.println("Found!");
                System.out.println(product);
                return;
            }
        }

        System.out.println("Product not found.");
    }

    public void displayProducts(){
        if(products.isEmpty()){
            System.out.println("The product list is empty.");
            return;
        }

        int a = 0;

        for(Product product : products){
            a++;
            System.out.println(a + ".\n" + product);
        }
    }

    public void displayCart(){
        if(cart.isEmpty()){
            System.out.println("Cart is empty");
            return;
        }

        int quantity;

        for(String a : cart.keySet()){
            System.out.println(a + ": " + cart.get(a)); //add quantity
        }
    }

    public int calculateTotal(){
        if(cart.isEmpty()){
            return 0;
        }

        int total=0;

        for(Product product : products){
            if(cart.containsKey(product.getName())){
                total+=product.getPrice()*cart.get(product.getName()); // multiply with quantity
            }
        }

        return total;
    }


}
