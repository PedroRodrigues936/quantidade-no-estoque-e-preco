package curso;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class programa {

	public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc =new Scanner(System.in);
    
    System.out.println("entre com os dados do produto: ");
    System.out.print("nome: ");
    String name = sc.nextLine();
    System.out.print("Preço: ");
    double price = sc.nextDouble();

    Product product = new Product (name,price);    
    
    System.out.println();
    System.out.println("atualizações: " + product);
    
    System.out.println();
    System.out.println("entre com a quantidade de produtos que deseja adicionar no estoque: ");
    int quantity = sc.nextInt();
    product.addProducts(quantity);
    
    System.out.println();
    System.out.println("atualizações data: " + product);
    
    System.out.println();
    System.out.println("entre com a quantitade de produtos que deseja retirar do estoque: ");
    quantity = sc.nextInt();
    product.removeProducts(quantity);
    
    System.out.println();
    System.out.println("atualizações=: " + product);
    
    sc.close();
    
	}

}
