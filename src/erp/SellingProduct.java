package erp;

public class SellingProduct extends Product{

    long salePrize;
    long purchasePrize;
    
    public SellingProduct() {
    }
    
    public void setSalePrize(long salePrize){
        this.salePrize = salePrize;
    }
    
    public long getSalePrize(){
        return salePrize;
    }
    
    public void setPurchasePrize(long purchasePrize){
        this.purchasePrize = purchasePrize;
    }
    
    public long getPurchasePrize(){
        return purchasePrize;
    }
}
