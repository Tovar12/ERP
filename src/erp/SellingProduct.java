package erp;

public class SellingProduct extends Product{

    long salePrice;
    long purchasePrice;
    
    public SellingProduct() {
    }
    
    public void setSalePrice(long salePrice){
        this.salePrice = salePrice;
    }
    
    public long getSalePrice(){
        return salePrice;
    }
    
    public void setPurchasePrice(long purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    
    public long getPurchasePrice(){
        return purchasePrice;
    }
}
