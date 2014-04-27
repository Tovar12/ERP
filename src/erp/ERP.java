package erp;

import java.util.ArrayList;

public class ERP {

    private Inventory inventory;
    private ArrayList<Provider> providerList;
    private ArrayList<Customer> customerList;          
    
    public ERP(){
    
        inventory = new Inventory();
        
        
        providerList = new ArrayList<>();
        Provider provider = new Provider();
        provider.setAddress("Carr 48 25 - 54");
        provider.setProviderName("Casemiro Cifuentes");
        provider.setTelephoneNumber(3045040);
        providerList.add(provider);
        provider.setAddress("Call 54 34 - 43");
        provider.setProviderName("Josefina Romero");
        provider.setTelephoneNumber(435485);
        providerList.add(provider);
        
        
        customerList = new ArrayList<>(); 
        Customer customer = new Customer();
        customer.setAddress("Carr 80 34 - 43");
        customer.setCustomerName("Albeiro Lozano");
        customer.setTelephoneNumber(3249586);
        customerList.add(customer);
        customer.setAddress("Tr 47 42 - 94");
        customer.setCustomerName("Dario Grosjean");
        customer.setTelephoneNumber(8477229);
        customerList.add(customer);
               
    }
    
    public boolean buildProduct(String productName){
        for(ManufacturedProduct mfp : this.inventory.getManufacturedProductList()){
            if(mfp.getProductName().equals(productName)){
                for(String rm : mfp.getRawMaterialList()){
                    for(RawMaterial rm1 : this.inventory.getRawMaterialList()){
                        if(rm.equals(rm1.getProductName())){
                            rm1.setQuantity(rm1.getQuantity()-1);
                        }
                    }
                }
            }
        }
        return true;
    }
    
    public boolean addProvider(Provider provider){
        for (int i = 0; i < providerList.size(); i++) {
            if (providerList.get(i).getProviderName().equals(provider.getProviderName())) {
                return false;                
            }
        }
        providerList.add(provider);
        return true;
    }
    
    public boolean editProvider(String providerName, String newProviderName, long telephoneNumber,
            String address){
        for (int i = 0; i < providerList.size(); i++) {
            if (providerList.get(i).getProviderName().equals(providerName)) {
                providerList.get(i).setProviderName(newProviderName);
                providerList.get(i).setTelephoneNumber(telephoneNumber);
                providerList.get(i).setAddress(address);
                return true;
            }
        }
        return false;
    }
    
    public boolean addCustomer(Customer customer){
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerName().equals(customer.getCustomerName())) {
                return false;                
            }
        }
        customerList.add(customer);
        return true;
    }
    
    public boolean editCustomer(String customerName, String newCustomerName, long telephoneNumber,
            String address){
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerName().equals(customerName)) {
                customerList.get(i).setCustomerName(newCustomerName);
                customerList.get(i).setTelephoneNumber(telephoneNumber);
                customerList.get(i).setAddress(address);
                return true;
            }
        }
        return false;
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