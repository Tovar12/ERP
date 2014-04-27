package erp;

public class Purchase extends Transaction{
    private String providerName;
    
    public Purchase() {
        
    }
    
    public void setProviderName(String providerName){
        this.providerName = providerName;
    }
    
    public String getProviderName(){
        return this.providerName;
    }
        
}
