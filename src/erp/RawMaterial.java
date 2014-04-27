package erp;

public class RawMaterial extends Product{

    long purchasePrice;
    //e invariant purchasePrice >= 0;
    
    public RawMaterial() {
    }
    
    public void setPurchasePrice(long purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    
    public long getPurchasePrice(){
        return purchasePrice;
    }
}
