package erp;

public class Customer {

    private String customerName;
    private long telephoneNumber;
    private String address;
    
    public Customer(){
        
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public void setTelephoneNumber(long telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    
    public long getTelephoneNumber(){
        return this.telephoneNumber;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
        
}
