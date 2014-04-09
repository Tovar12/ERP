package erp;

import java.util.ArrayList;

public class Inventory {

    
    //En el UML aparece como un ArrayList de Transaction
    ArrayList<Sale> saleList;
    ArrayList<Purchase> purchaseList;
    ArrayList<ManufacturedProduct> manufacturedProductList;
    ArrayList<RawMaterial> rawMaterialList;
    ArrayList<SellingProduct> sellingProductList;
    
    public Inventory() {
    }
    
    public boolean addNewManufacturedProduct(ManufacturedProduct product){
        return true;
    }
    
    public boolean addNewRawMaterial(RawMaterial product){
        return true;
    }
    
    public boolean addNewSellingProduct(SellingProduct product){
        return true;
    }
    
    public boolean editProduct(String productName, String newProductName,
                               int newProdcutQuantity){
        return true;
    }
    
    public void setSaleList(ArrayList<Sale> saleList){
        
    }
    
    public ArrayList<Sale> getSaleList(){
        return saleList;
    }
       
    public void setPurchaseList(ArrayList<Purchase> purchaseList){
        
    }
    
    public ArrayList<Purchase> getPurchaseList(){
        return purchaseList;
    }    
    
    public void setManufacturedProductList(ArrayList<ManufacturedProduct> manufacturedProductList){
        this.manufacturedProductList = manufacturedProductList;
    }
    
    public ArrayList<ManufacturedProduct> getManufacturedProductList(){
        return manufacturedProductList;    
    }
    
    public void setRawMaterialList(ArrayList<RawMaterial> rawMaterialList){
        this.rawMaterialList = rawMaterialList;
    }
    
    public ArrayList<RawMaterial> getRawMaterialList(){
        return rawMaterialList;    
    }    
    
    public void setSellingProductList(ArrayList<SellingProduct> sellingProductList){
        this.sellingProductList = sellingProductList;
    }
    
    public ArrayList<SellingProduct> getSellingProductList(){
        return sellingProductList;    
    }       
    
}
