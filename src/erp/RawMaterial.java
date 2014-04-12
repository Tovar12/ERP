package erp;

public class RawMaterial extends Product{

    long purchasePrice;
    
    public RawMaterial() {
    }
    
    public void setPurchasePrice(long purchasePrice){
        this.purchasePrice = purchasePrice;
    }
    
    public long getPurchasePrice(){
        return purchasePrice;
    }
}
