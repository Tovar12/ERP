package erp;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Sale> saleList;
    private ArrayList<Purchase> purchaseList;
    private ArrayList<ManufacturedProduct> manufacturedProductList;
    //ArrayList<RawMaterial> rawMaterialList = new ArrayList<>();
    private ArrayList<RawMaterial> rawMaterialList;
    private ArrayList<SellingProduct> sellingProductList;
    
    public Inventory() {
        //Llenar el rawMaterial con dos productos base
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
    
    public boolean registerSale(ArrayList<String> productList, String customerName, long salePrize){
        Sale sale = new Sale();
        sale.setCustomerName(customerName);
        sale.setProductList(productList);
        sale.setTransactionPrize(salePrize);
        
        
        this.getSaleList().add(sale);
        return true;
    }
    
    public boolean registerPurchase(ArrayList<String> productList, String providerName, long purchasePrize){
        Purchase purchase = new Purchase();
        purchase.setProviderName(providerName);
        purchase.setProductList(productList);
        purchase.setTransactionPrize(purchasePrize);
        
        
        this.getPurchaseList().add(purchase);
        return true;
    }
    
    public boolean buildProduct(String productName){
       
        for(ManufacturedProduct mfp : this.getManufacturedProductList()){
            if(mfp.getProductName().equals(productName)){
                for(String rm : mfp.getRawMaterialList()){
                    for(RawMaterial rm1 : this.getRawMaterialList()){
                        if(rm.equals(rm1.getProductName())){
                                if(rm1.getQuantity()>0){
                                    rm1.setQuantity(rm1.getQuantity()-1);
                                }else{
                                    return false;
                                }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    
    
    //Se valida si ya existe el manufactured antes de agregarlo
    //Se realiza mediante la comparacion de nombres
    public boolean addNewManufacturedProduct(ManufacturedProduct product){
        for (int i = 0; i < manufacturedProductList.size(); i++) {
            if (manufacturedProductList.get(i).getProductName().equals(product.getProductName())) {
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
            if (rawMaterialList.get(i).getProductName().equals(product.getProductName())) {
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
            if (sellingProductList.get(i).getProductName().equals(product.getProductName())) {
                return false;                
            }
        }
        sellingProductList.add(product);
        return true;        
    }
    
    
    //Se edita un producto de tipo RawMaterial
    public boolean editRawMaterialProduct(String productName, String newProductName,
                               int newProductQuantity, long newPurchasePrice){
        
        for (int i = 0; i < rawMaterialList.size(); i++) {
            if (rawMaterialList.get(i).getProductName().equals(productName)) {
                rawMaterialList.get(i).setProductName(newProductName);
                rawMaterialList.get(i).setQuantity(newProductQuantity);
                rawMaterialList.get(i).setPurchasePrice(newPurchasePrice);
                return true;
            }
        }
        return false;
    }
    
    //Se edita un producto de tipo manufactured
    public boolean editManufacturedProduct(String productName, String newProductName,
                               int newProductQuantity, long newSalePrice){
        
        for (int i = 0; i < manufacturedProductList.size(); i++) {
            int actualQuantity = 0;
            if (manufacturedProductList.get(i).getProductName().equals(productName)) {
                manufacturedProductList.get(i).setProductName(newProductName);
                manufacturedProductList.get(i).setSalePrice(newSalePrice);
                int oldProductQuantity = manufacturedProductList.get(i).getQuantity();
                if(oldProductQuantity < newProductQuantity){
                    int difference = newProductQuantity - oldProductQuantity;
                    for(int j=0; j<difference; j++){
                        boolean buildingSuccessful = this.buildProduct(productName);
                        if(buildingSuccessful == false){
                            actualQuantity = oldProductQuantity + j;
                            System.out.println("There is not enough RawMaterial to build "
                                    +"\n"
                                    + "the amount of this Manufatured Product you want to "
                                    +"\n"
                                    + "build.");
                            
                            System.out.println("");
                            System.out.println("" + j + " of these products were built");
                            System.out.println("");
                            System.out.println("The new quantity of these product is " + 
                                    actualQuantity + ".");
                            break;
                        }
                        actualQuantity = newProductQuantity;
                    }
                }
                manufacturedProductList.get(i).setQuantity(actualQuantity);
                return true;
            }
        }
        return false;
    }  
    
    
    //Se edita un producto de tipo selling
    public boolean editSellingProduct(String productName, String newProductName,
                               int newProductQuantity, long newPurchasePrice,
                               long newSalePrice){
        
        for (int i = 0; i < sellingProductList.size(); i++) {
            if (sellingProductList.get(i).getProductName().equals(productName)) {
                sellingProductList.get(i).setProductName(newProductName);
                sellingProductList.get(i).setQuantity(newProductQuantity);
                sellingProductList.get(i).setSalePrice(newSalePrice);                
                sellingProductList.get(i).setPurchasePrice(newPurchasePrice);
                return true;
            }
        }
        return false;        
    }    
    
    //Borra un rawmaterial
    public boolean deleteRawMaterialProduct(String productName){
        for (int i = 0; i < rawMaterialList.size(); i++) {
            if (rawMaterialList.get(i).getProductName().equals(productName)) {
                rawMaterialList.remove(i);
                return true;                
            }
        }        
        return false;        
    }
    
    //Borra un manufactured    
    public boolean deleteManufacturedProduct(String productName){
        for (int i = 0; i < manufacturedProductList.size(); i++) {
            if (manufacturedProductList.get(i).getProductName().equals(productName)) {
                manufacturedProductList.remove(i);
                return true;                
            }
        }        
        return false;        
    }    
    
    //Borra un selling
    public boolean deleteSellingProduct(String productName){
        for (int i = 0; i < sellingProductList.size(); i++) {
            if (sellingProductList.get(i).getProductName().equals(productName)) {
                sellingProductList.remove(i);
                return true;                
            }
        }        
        return false;        
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
