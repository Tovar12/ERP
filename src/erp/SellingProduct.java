package erp;

public class SellingProduct extends Product{

    long salePrice;
    long purchasePrice;
    //e invariant salePrice >= 0;
    //e invariant purchasePrice >= 0;
    
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
