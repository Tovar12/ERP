package erp;

public class Product {

    String productName;
    int quantity; 
    
    public Product() {
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProduct(){
        return productName;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
}
