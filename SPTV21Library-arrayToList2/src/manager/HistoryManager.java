

package manager;

import entity.Product;
import entity.History;
import entity.Reader;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;


public class HistoryManager {
private final Scanner scanner;
public static int totalSumma;
    public HistoryManager() {
        scanner = new Scanner(System.in);
        
    }
    
    public History takeOnBook(List<Product> products, List<Reader> clients){
        
    System.out.println("Список клиентов: ");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i+1+". "+clients.get(i).getFirstname()+" "+clients.get(i).getLastname());
        }
        System.out.print("Выбери клиента: ");
        int numberClient = scanner.nextInt(); scanner.nextLine();
        System.out.println("Список обуви: ");
        for (int i = 0; i < products.size(); i++) {
            System.out.print(i+1+". "+products.get(i).getProdName()+". ");
            System.out.println();    
        }   
        System.out.print("Выбери номер обуви: ");
        int numberProduct = scanner.nextInt();scanner.nextLine();
        System.out.print("Выберите кол-во товара: ");
        int quantityBuyingProduct = scanner.nextInt(); scanner.nextLine();
        History history = new History();
        int clientMonay = clients.get(numberClient - 1).getMony();
        int productPrice = products.get(numberProduct - 1).getPrice();
        if(quantityBuyingProduct<=products.get(numberProduct - 1).getQuantity() ){
        if(quantityBuyingProduct>0){
            productPrice = quantityBuyingProduct*productPrice;
        if (clientMonay > productPrice) {
            history.setTakeOnProduct(new GregorianCalendar().getTime());
            history.setProduct(products.get(numberProduct - 1));
            history.setClient(clients.get(numberClient-1));
            history.getClient().setMony(  history.getClient().getMony()-history.getProduct().getPrice()*quantityBuyingProduct);
            int ark = products.get(numberProduct - 1).getQuantity() - quantityBuyingProduct;
            products.get(numberProduct - 1).setQuantity(ark);
            totalSumma = productPrice;
            
            return history;
        }else {
            System.out.println("денег не хватает");
            return null;
        }}else{System.out.println("товар закончился");
            return null;
            }}else{System.out.println("такого кол-ва товара нет");
            return null;
        
    }
    
    
}}
