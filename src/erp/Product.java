package erp;

public class Product {

    private String productName;
    private int quantity; 
    
    public Product() {
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }
    
    public String getProductName(){
        return productName;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
}
