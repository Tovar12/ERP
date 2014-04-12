package erp;

import java.util.ArrayList;

public class Inventory {

    ArrayList<Sale> saleList;
    ArrayList<Purchase> purchaseList;
    ArrayList<ManufacturedProduct> manufacturedProductList;
    ArrayList<RawMaterial> rawMaterialList;
    ArrayList<SellingProduct> sellingProductList;
    
    public Inventory() {
        
        //LLenar el rawMaterialList con dos productos base
        rawMaterialList = new ArrayList<>();
        
        RawMaterial rawMaterial = new RawMaterial();
        
        rawMaterial.setProductName("tabla");
        rawMaterial.setQuantity(2);
        rawMaterial.setPurchasePrice(2000);
        
        rawMaterialList.add(rawMaterial);
        
        rawMaterial = new RawMaterial();
        
        rawMaterial.setProductName("clavo");
        rawMaterial.setQuantity(20);
        rawMaterial.setPurchasePrice(200);        
        
        rawMaterialList.add(rawMaterial);
        
        //Llenar el manufacturedProduct con dos productos base
        manufacturedProductList = new ArrayList<>();
        
        ManufacturedProduct manufactured = new ManufacturedProduct();
        
        manufactured.setProductName("silla");
        manufactured.setQuantity(5);
        manufactured.setSalePrice(60000);
        
        manufacturedProductList.add(manufactured);
        
        manufactured = new ManufacturedProduct();
        
        manufactured.setProductName("mesa");
        manufactured.setQuantity(8);
        manufactured.setSalePrice(160000);        
        
        manufacturedProductList.add(manufactured);
        
        //Llenar el sellingProduct con dos productos base
        
        sellingProductList = new ArrayList<>();
        
        SellingProduct selling = new SellingProduct();
        
        selling.setProductName("computador");
        selling.setQuantity(10);
        selling.setPurchasePrice(1250000);
        selling.setSalePrice(2000000);
        
        sellingProductList.add(selling);
        
        selling = new SellingProduct();
        
        selling.setProductName("televisor");
        selling.setQuantity(19);
        selling.setPurchasePrice(250000);
        selling.setSalePrice(500000);
        
        sellingProductList.add(selling);        
    }
    
    //Se valida si ya existe el manufactured antes de agregarlo
    //Se realiza mediante la comparacion de nombres
    public boolean addNewManufacturedProduct(ManufacturedProduct product){
        for (int i = 0; i < manufacturedProductList.size(); i++) {
            if (manufacturedProductList.get(i).productName.equals(product.productName)) {
                return false;                
            }
        }
        manufacturedProductList.add(product);
        return true;        
    }
    
    //Se valida si ya existe el rawmaterial antes de agregarlo
    //Se realiza mediante la comparacion de nombres    
    public boolean addNewRawMaterial(RawMaterial product){
        for (int i = 0; i < rawMaterialList.size(); i++) {
            if (rawMaterialList.get(i).productName.equals(product.productName)) {
                return false;                
            }
        }
        rawMaterialList.add(product);
        return true;
    }
    
    //Se valida si ya existe el selling antes de agregarlo
    //Se realiza mediante la comparacion de nombres     
    public boolean addNewSellingProduct(SellingProduct product){
        for (int i = 0; i < sellingProductList.size(); i++) {
            if (sellingProductList.get(i).productName.equals(product.productName)) {
                return false;                
            }
        }
        sellingProductList.add(product);
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
