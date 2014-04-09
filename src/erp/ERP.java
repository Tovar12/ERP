package erp;

import java.util.ArrayList;

public class ERP {

    Inventory inventory;
    ArrayList<Provider> providerList;
    ArrayList<Customer> customerList;          
    
    public ERP(){
    
        inventory = new Inventory();
        providerList = new ArrayList<>();
        customerList = new ArrayList<>();        
    }
    
    public boolean buildProduct(String productName){
        return true;
    }
    
    public boolean addProvider(Provider provider){
        return true;
    }
    
    public boolean deleteProvider(String providerName){
        return true;
    }
    
    public boolean addCustomer(Customer customer){
        return true;
    }
    
    public boolean deleteCustomer(String customerName){
        return true;
    }
    
    public void setInventory(Inventory inventory){
        this.inventory = inventory;
    }
    
    public Inventory getInventory(){
        return inventory;
    }   
    
    public void setProvider(ArrayList<Provider> providerList){
        this.providerList = providerList;
    }
    
    public ArrayList<Provider> getProvider(){
        return providerList;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList){
        this.customerList = customerList;
    }
    
    public ArrayList<Customer> getCustomer(){
        return customerList;
    }
}