package erp;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Scanner;

public class FLowClass {

    static boolean salida = true;
    //Se deben declarar fuera los objetos para que no reinicie las clases
    //y borre los cambios realizados en ellos
    static RawMaterial rawMaterial = new RawMaterial();;
    static Inventory inventory = new Inventory();
    static ManufacturedProduct manufactured = new ManufacturedProduct();
    static SellingProduct selling = new SellingProduct();    
    
    public static void main(String[] args) {
       // startedItems();
        while (salida) {            
            menu();
        }        
        System.out.println("Fin del programa");
    }

    public static void menu() {

        Scanner entrada = new Scanner(System.in);
        ERP objERP = new ERP();
        String productName = "";
        String ProductNewName = "";
        int productQuantity = 0;
        long productSalePrice = 0;
        long productPurchasePrice = 0;                       
        
        System.out.println("Main menu:");
        System.out.println("Select an option writting the number"
                + " of the item:");
        System.out.println("1. Customer submenu");
        System.out.println("2. Provider submenu");
        System.out.println("3. Inventory submenu");
        System.out.println("4. Exit");
        String option = entrada.nextLine();
        System.out.println("Write again the item you want to use");
        System.out.println("I.e 1.1 or 2.3");
        switch (option) {
            case "1":
                System.out.println("1.1. Add a customer");
                System.out.println("1.2. Edit a customer");
                System.out.println("1.3. Delete a customer");
                option = entrada.nextLine();
                break;
            case "2":
                System.out.println("2.1. Add a provider");
                System.out.println("2.2. Edit a provider");
                System.out.println("2.3. Delete a provider");
                option = entrada.nextLine();
                break;
            case "3":
                System.out.println("3.1. Add a rawMaterial product");
                System.out.println("3.2. Edit a rawMaterial product");
                System.out.println("3.3. Delete a rawMaterial product");
                System.out.println("3.4. Add a manufactured product");
                System.out.println("3.5. Edit a manufactured product");
                System.out.println("3.6. Delete a manufactured product");
                System.out.println("3.7. Add a selling product");
                System.out.println("3.8. Edit a selling product");
                System.out.println("3.9. Delete a selling product");
                option = entrada.nextLine();
                break;
            case "4":
                salida = false;
                break;
            default:
                System.out.println("Dato ingresado incorrecto");
                option = "";
        }

        switch (option) {
            case "1.1": //objERP.addCustomer(null);
                break;
            case "1.2":
                break;
            case "1.3":
                break;
            case "2.1":
                break;
            case "2.2":
                break;
            case "2.3":
                break;
            case "3.1":
                System.out.println("Write the name of the rawMaterial product:");
                productName = entrada.nextLine();
                rawMaterial.setProductName(productName);
                System.out.println("Write how many rawMaterial products did you buy:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                rawMaterial.setQuantity(productQuantity);
                System.out.println("Write the purchase price of each element:");
                productPurchasePrice = Long.parseLong(entrada.nextLine());
                rawMaterial.setPurchasePrice(productPurchasePrice);

                if (inventory.addNewRawMaterial(rawMaterial)) {
                    System.out.println("RawMaterial product added");
                } else {
                    System.out.println("You already have that rawMaterial");
                }
                break;
            case "3.2":
                System.out.println("Write the name of the rawMaterial product to edit:");
                productName = entrada.nextLine();
                System.out.println("Write the new name of the rawMaterial product to edit:");
                ProductNewName = entrada.nextLine();
                System.out.println("Write the new number of rawMaterial product that you have:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                System.out.println("Write the new purchase price of each element:");
                productPurchasePrice = Long.parseLong(entrada.nextLine());

                if (inventory.editRawMaterialProduct(productName, ProductNewName, productQuantity, productPurchasePrice)) {
                    System.out.println("RawMaterial product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.3":
                System.out.println("Write the name of the rawMaterial product for delete:");
                productName = entrada.nextLine();
                
                if (inventory.deleteRawMaterialProduct(productName)) {
                    System.out.println("RawMaterial product deleted");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.4":
                System.out.println("Write the name of the manufactured product:");
                productName = entrada.nextLine();
                manufactured.setProductName(productName);
                System.out.println("Write how many manufactured products do you have for sale:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                manufactured.setQuantity(productQuantity);
                System.out.println("Write the price of each element:");
                productSalePrice = Long.parseLong(entrada.nextLine());
                manufactured.setSalePrice(productSalePrice);

                if (inventory.addNewManufacturedProduct(manufactured)) {
                    System.out.println("Manufactured product added");
                } else {
                    System.out.println("You already have that rawMaterial");
                }
                break;
            case "3.5":
                System.out.println("Write the name of the manufactured product to edit:");
                productName = entrada.nextLine();
                System.out.println("Write the new name of the manufactured product to edit:");
                ProductNewName = entrada.nextLine();
                System.out.println("Write the new number of manufactured product that you have:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                System.out.println("Write the new sale price of each element:");
                productSalePrice = Long.parseLong(entrada.nextLine());

                if (inventory.editManufacturedProduct(productName, ProductNewName, productQuantity, productSalePrice)) {
                    System.out.println("Manufactured product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.6":
                System.out.println("Write the name of the manufactured product for delete:");
                productName = entrada.nextLine();
                
                if (inventory.deleteManufacturedProduct(productName)) {
                    System.out.println("Manufactured product deleted");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.7":
                System.out.println("Write the name of the manufactured product:");
                productName = entrada.nextLine();
                selling.setProductName(productName);
                System.out.println("Write how many selling products are avaible for sale:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                selling.setQuantity(productQuantity);
                System.out.println("Write the purchase price of each item");
                productPurchasePrice = Long.parseLong(entrada.nextLine());
                selling.setPurchasePrice(productPurchasePrice);
                System.out.println("Write the sale price of each item:");
                productSalePrice = Long.parseLong(entrada.nextLine());
                selling.setSalePrice(productSalePrice);

                if (inventory.addNewSellingProduct(selling)) {
                    System.out.println("Selling product added");
                } else {
                    System.out.println("You already have that rawMaterial");
                }
                break;
            case "3.8":
                System.out.println("Write the name of the selling product to edit:");
                productName = entrada.nextLine();
                System.out.println("Write the new name of the selling product to edit:");
                ProductNewName = entrada.nextLine();
                System.out.println("Write the new number of selling product that you have:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                System.out.println("Write the new purchase price of each element:");
                productPurchasePrice = Long.parseLong(entrada.nextLine());
                System.out.println("Write the new sale price of each element:");
                productSalePrice = Long.parseLong(entrada.nextLine());

                if (inventory.editSellingProduct(productName, ProductNewName, productQuantity, productPurchasePrice, productSalePrice)) {
                    System.out.println("Selling product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.9":
                System.out.println("Write the name of the selling product for delete:");
                productName = entrada.nextLine();
                
                if (inventory.deleteSellingProduct(productName)) {
                    System.out.println("Selling product deleted");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            default:
        }
    }
    
}
