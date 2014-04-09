package erp;

import java.util.Scanner;

public class FLowClass {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ERP objERP = new ERP();
        String producName = "";
        int productQuantity = 0;
        long producPrize = 0;

        System.out.println("Main menu:");
        System.out.println("Select an option writting the number"
                + " of the item:");
        System.out.println("1. Customer submenu");
        System.out.println("2. Provider submenu");
        System.out.println("3. Inventory submenu");
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
                producName = entrada.nextLine();
                System.out.println("Write how many rawMaterial products did you buy");
                break;
            case "3.2":                
                break;
            case "3.3":
                break;
            default:
        }

    }
}
