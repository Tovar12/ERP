package erp;

import java.util.ArrayList;

public class ManufacturedProduct extends Product{

    private long salePrice;
    private ArrayList<String> rawMaterialList;
    //e invariant salePrice >= 0;
    
    public ManufacturedProduct() {
        rawMaterialList = new ArrayList<>();
    }
    
    public void setSalePrice(long salePrice){
        this.salePrice = salePrice;
    }
    
    public long getSalePrice(){
        return salePrice;
    }
    
    public void setRawMaterialList(ArrayList<String> rawMaterialList){
        this.rawMaterialList = rawMaterialList;
    }
    
    public ArrayList<String> getRawMaterialList(){
       return this.rawMaterialList;
    }
}
