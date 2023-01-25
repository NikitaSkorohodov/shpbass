

package manager;

import entity.Author;
import entity.Product;
import java.util.List;
import java.util.Scanner;


public class BookManager {
    private final Scanner scanner;

    public BookManager() {
        scanner = new Scanner(System.in);
    }
    
    public Product createBookWithAuthors(){
         System.out.println("2. Добавить обувь");
                    System.out.print("Введите название обуви: ");
                    String prodName = scanner.nextLine();
                    System.out.print("Введите цену обуви: ");
                    String price= scanner.nextLine();
                    System.out.print("Введите количество пар: ");
                    String quantity= scanner.nextLine();
                    
                    Product product = createProd(prodName,new Integer(quantity), new Integer(price));
                    
        return product;
    }
    public void printListBooks(List<Product> products){
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i+1+". "+products.get(i).getProdName()+". количество "+products.get(i).getQuantity()+". цена "+"$"+products.get(i).getPrice());
    }
    
    
    }
    
    
    public Product createProd(String prodName,int quantity, int price){
        Product product = new Product();
        product.setProdName(prodName);
        product.setQuantity(quantity);
        product.setPrice(price);
        return product;
    }
}
