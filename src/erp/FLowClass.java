package erp;

import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.Scanner;

public class FLowClass {
    private static ERP objERP = new ERP();
    private static boolean salida = true;    
    
    public static void main(String[] args) {
       // startedItems();
        while (salida) {            
            menu();
        }        
        System.out.println("Fin del programa");
    }

    public static void menu() {
        
        Provider newProvider = new Provider();
        Customer newCustomer = new Customer();
        RawMaterial rawMaterial = new RawMaterial();
        ManufacturedProduct manufactured = new ManufacturedProduct();
        SellingProduct selling = new SellingProduct();    
        Scanner entrada = new Scanner(System.in);
        String productName = "";
        String ProductNewName = "";
        int productQuantity = 0;
        long productSalePrice = 0;
        long productPurchasePrice = 0;  
        String customerName = "";
        String providerName = "";
        String newProviderName = "";
        long newProviderTN = 0;
        String newProviderAddress = "";
        String newCustomerName = "";
        long newCustomerTN = 0;
        String newCustomerAddress = "";
        String customerNameToEdit = "";
        String providerNameToEdit = "";
        
        
        
        System.out.println("Main menu:");
        System.out.println("Write number to select the submenu you want to access");
        System.out.println("1. Customer submenu");
        System.out.println("2. Provider submenu");
        System.out.println("3. Inventory submenu");
        System.out.println("4. Transaction submenu");
        System.out.println("5. Exit");
        String option = entrada.nextLine();
        
        switch (option) {
            case "1":
                System.out.println("Write number to select the option");
                System.out.println("I.e 1.1");
                System.out.println("1.1. Add a customer");
                System.out.println("1.2. Edit a customer");
                System.out.println("1.3. Delete a customer");
                option = entrada.nextLine();
                break;
            case "2":
                System.out.println("Write number to select the option");
                System.out.println("I.e 2.2");
                System.out.println("2.1. Add a provider");
                System.out.println("2.2. Edit a provider");
                System.out.println("2.3. Delete a provider");
                option = entrada.nextLine();
                break;
            case "3":
                System.out.println("Write number to select the option");
                System.out.println("I.e 3.3");
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
                System.out.println("Write number to select the option");
                System.out.println("I.e 4.2");
                System.out.println("4.1. Register a purchase");
                System.out.println("4.2. Register a sale");
                option = entrada.nextLine();
                break;
            case "5":
                salida = false;
                break;
            default:
                System.out.println("Invalid number, try again");
                option = "";
        }

        switch (option) {
            case "1.1": 
                System.out.println("Write the name of the new Customer:");
                newCustomerName = entrada.nextLine();
                newCustomer.setCustomerName(newCustomerName);
                System.out.println("Write the telephone number of the new Customer:");
                newCustomerTN = Long.parseLong(entrada.nextLine());
                newCustomer.setTelephoneNumber(newCustomerTN);
                System.out.println("Write the address of the new Customer:");
                newCustomerAddress = entrada.nextLine();
                newCustomer.setAddress(newCustomerAddress);

                if (objERP.addCustomer(newCustomer)) {
                    System.out.println("Customer added");
                } else {
                    System.out.println("That Customer already exists");
                }               
                break;
            case "1.2":
                System.out.println("Write the name of the Customer to edit:");
                customerNameToEdit = entrada.nextLine();
                System.out.println("Write the new Customer name");
                newCustomerName = entrada.nextLine();
                System.out.println("Write the new telephone number of the Customer");
                newCustomerTN = Long.parseLong(entrada.nextLine());
                System.out.println("Write the new address of the Customer:");
                newCustomerAddress = entrada.nextLine();

                if (objERP.editCustomer(customerNameToEdit, newCustomerName, newCustomerTN, newCustomerAddress)) {
                    System.out.println("Customer edited");
                } else {
                    System.out.println("Customer doesnt exist");
                }
                break;
                
            case "2.1":
                System.out.println("Write the name of the new Provider:");
                newProviderName = entrada.nextLine();
                newProvider.setProviderName(newProviderName);
                System.out.println("Write the telephone number of the new provider:");
                newProviderTN = Long.parseLong(entrada.nextLine());
                newProvider.setTelephoneNumber(newProviderTN);
                System.out.println("Write the address of the new Provider:");
                newProviderAddress = entrada.nextLine();
                newProvider.setAddress(newProviderAddress);

                if (objERP.addProvider(newProvider)) {
                    System.out.println("Provider added");
                } else {
                    System.out.println("Provider already exists");
                }               
                break;
            case "2.2":
                System.out.println("Write the name of the Provider to edit:");
                providerNameToEdit = entrada.nextLine();
                System.out.println("Write the new Provider name");
                newProviderName = entrada.nextLine();
                System.out.println("Write the new telephone number of the Provider");
                newProviderTN = Long.parseLong(entrada.nextLine());
                System.out.println("Write the new address of the Provider:");
                newProviderAddress = entrada.nextLine();

                if (objERP.editProvider(providerNameToEdit, newProviderName, newProviderTN, newProviderAddress)) {
                    System.out.println("Provider edited");
                } else {
                    System.out.println("Provider doesnt exist");
                }
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

                if (objERP.getInventory().addNewRawMaterial(rawMaterial)) {
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

                if (objERP.getInventory().editRawMaterialProduct(productName, ProductNewName, productQuantity, productPurchasePrice)) {
                    System.out.println("RawMaterial product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.3":
                System.out.println("Write the name of the rawMaterial product to delete:");
                productName = entrada.nextLine();
                
                if (objERP.getInventory().deleteRawMaterialProduct(productName)) {
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
                
                System.out.println("Enter the list of Raw Material that needs to be used "
                        +"\n" 
                        + "to build the Manufactured Product by writing the product name and "
                        +"\n"
                        + "clicking enter to enter the next one. To finish entering the Raw "
                        +"\n"
                        + "Material write 'Finish'.");
                
                while(true){
                    int rmChecking = 0;
                    String expedtedProduct = entrada.nextLine();
                    if(expedtedProduct.equalsIgnoreCase("Finish")){
                        break;
                    }
                    for(RawMaterial rm : objERP.getInventory().getRawMaterialList()){
                        if(expedtedProduct.equalsIgnoreCase(rm.getProductName())) {
                            rmChecking++;
                        }
                    }  
                    if(rmChecking==1){
                        manufactured.getRawMaterialList().add(expedtedProduct);
                    }else{
                        System.out.println("The Raw Material you specified is not present in the "
                                +"\n"
                                + "Raw Material List. Please make sure you enter a Raw Material "
                                +"\n"
                                + "tha is.");
                    }
                }
                
              
                if (objERP.getInventory().addNewManufacturedProduct(manufactured)) {
                    System.out.println("Manufactured product added");
                } else {
                    System.out.println("You already have that manufactured product");
                }    
                
                
                break;
            case "3.5":
                System.out.println("Write the name of the manufactured product to edit:");
                productName = entrada.nextLine();
                System.out.println("Write the new name of the manufactured product to edit:");
                ProductNewName = entrada.nextLine();
                System.out.println("Write the new quantity of these manufactured product:");
                productQuantity = Integer.parseInt(entrada.nextLine());
                System.out.println("Write the new sale price of each element:");
                productSalePrice = Long.parseLong(entrada.nextLine());

                if (objERP.getInventory().editManufacturedProduct(productName, ProductNewName, productQuantity, productSalePrice)) {
                    System.out.println("Manufactured product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.6":
                System.out.println("Write the name of the manufactured product for delete:");
                productName = entrada.nextLine();
                
                if (objERP.getInventory().deleteManufacturedProduct(productName)) {
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

                if (objERP.getInventory().addNewSellingProduct(selling)) {
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

                if (objERP.getInventory().editSellingProduct(productName, ProductNewName, productQuantity, productPurchasePrice, productSalePrice)) {
                    System.out.println("Selling product edited");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "3.9":
                System.out.println("Write the name of the selling product for delete:");
                productName = entrada.nextLine();
                
                if (objERP.getInventory().deleteSellingProduct(productName)) {
                    System.out.println("Selling product deleted");
                } else {
                    System.out.println("The product doesnt exist");
                }
                break;
            case "4.1":
                System.out.println("Write the name of the customer");
                customerName = entrada.nextLine();
                ArrayList<String> productNameList = new ArrayList<>();
                long salePrize = 0;
                
                System.out.println("Enter the list of Manufactured Products and Selling Products "
                        +"\n"
                        + "to be registered in the Sale. For this  write the Manufactured"
                        +"\n"
                        + "Products names and press Enter after each record. To start entering the "
                        +"\n"
                        + "Selling Products write '+' and press Enter. To finish entering the records "
                        +"\n"
                        + "write 'finish' ");
                
                
                String expedtedProduct = entrada.nextLine();
                    
                    while(true){
                        int prChecking = 0;
                        if(expedtedProduct.equalsIgnoreCase("Finish") || expedtedProduct.equalsIgnoreCase("+")){
                            break;
                        }
                        for(ManufacturedProduct mf : objERP.getInventory().getManufacturedProductList()){
                            if(expedtedProduct.equalsIgnoreCase(mf.getProductName())) {
                                prChecking++;
                                salePrize += mf.getSalePrice();
                            }
                        }  
                        if(prChecking==1){
                            productNameList.add(expedtedProduct);
                        }else{
                            System.out.println("The Manufactured Product you specified is not present in the list "
                                    +"\n"
                                    + "of Manufactured Products that we sell.");
                        }
                    }
                    while(true){
                        if(expedtedProduct.equalsIgnoreCase("Finish")){
                            break;
                        }
                        int prChecking = 0;
                        for(SellingProduct sp : objERP.getInventory().getSellingProductList()){
                            if(expedtedProduct.equalsIgnoreCase(sp.getProductName())) {
                                prChecking++;
                                salePrize += sp.getSalePrice();
                            }
                        }  
                        if(prChecking==1){
                            productNameList.add(expedtedProduct);
                        }else{
                            System.out.println("The Selling Product you specified is not present in the list "
                                    +"\n"
                                    + "of Selling Products that we sell.");
                        }
                    }
                objERP.getInventory().registerSale(productNameList, customerName, salePrize);
                break;
            case "4.2": 
                System.out.println("Write the name of the customer");
                providerName = entrada.nextLine();
                ArrayList<String> productNameList1 = new ArrayList<>();
                long purchasePrize = 0;
                
                System.out.println("Enter the list of Raw Material Products and Selling Products "
                        +"\n"
                        + "to be registered in the Purchase. For this  write the Raw Material "
                        +"\n"
                        + "Products names and press Enter after each record. To start entering the "
                        +"\n"
                        + "Selling Products write '+' and press Enter. To finish entering the records "
                        +"\n"
                        + "write 'finish' ");
                
                
                String expedtedProduct1 = entrada.nextLine();
                    
                    while(true){
                        int prChecking = 0;
                        if(expedtedProduct1.equalsIgnoreCase("Finish") || expedtedProduct1.equalsIgnoreCase("+")){
                            break;
                        }
                        for(RawMaterial rm : objERP.getInventory().getRawMaterialList()){
                            if(expedtedProduct1.equalsIgnoreCase(rm.getProductName())) {
                                prChecking++;
                                purchasePrize += rm.getPurchasePrice();
                            }
                        }  
                        if(prChecking==1){
                            productNameList1.add(expedtedProduct1);
                        }else{
                            System.out.println("The Raw Material Product Product you specified is not present in the list "
                                    +"\n"
                                    + "of Manufactured Products that we sell.");
                        }
                    }
                    while(true){
                        if(expedtedProduct1.equalsIgnoreCase("Finish")){
                            break;
                        }
                        int prChecking = 0;
                        for(SellingProduct sp : objERP.getInventory().getSellingProductList()){
                            if(expedtedProduct1.equalsIgnoreCase(sp.getProductName())) {
                                prChecking++;
                                purchasePrize += sp.getPurchasePrice();
                            }
                        }  
                        if(prChecking==1){
                            productNameList1.add(expedtedProduct1);
                        }else{
                            System.out.println("The Selling Product you specified is not present in the list "
                                    +"\n"
                                    + "of Selling Products that we sell.");
                        }
                    }
                objERP.getInventory().registerSale(productNameList1, providerName, purchasePrize);    
            default:
        }
    }
    
}
