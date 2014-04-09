package erp;

import java.util.ArrayList;

public class ManufacturedProduct extends Product{

    long salePrice;
    ArrayList<RawMaterial> rawMaterialList;
    
    public ManufacturedProduct() {
    }
   
    public void setSalePrice(long salePrice){
        this.salePrice = salePrice;
    }
    
    public long getSalePrice(){
        return salePrice;
    }
    
    public void setRawMaterialList(ArrayList<RawMaterial> rawMaterialList){
        this.rawMaterialList = rawMaterialList;
    }
}
