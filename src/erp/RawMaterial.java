package erp;

public class RawMaterial extends Product{

    long purchasePrize;
    
    public RawMaterial() {
    }
    
    public void setPurchasePrize(long purchasePrize){
        this.purchasePrize = purchasePrize;
    }
    
    public long getPurchasePrize(){
        return purchasePrize;
    }
}
