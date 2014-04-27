package erp;

public class Sale extends Transaction{
    private String customerName;
    
    public Sale() {
        
    }
    
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    
    public String getnCustomerName(){
        return this.customerName;
    }
    
        
}
