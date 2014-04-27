/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erp;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class Transaction {
    private ArrayList<String> productList = new ArrayList();
    private long transactionPrize;
    
    //e invariant transactionPriza >= 0;
    public Transaction(){
        
    }
    
    public void setProductList(ArrayList<String> productList){
        this.productList = productList;
    }
    
    public ArrayList<String> getProductList(){
        return this.productList;
    }
    
    public void setTransactionPrize(long transactionPrize){
        this.transactionPrize = transactionPrize;
    }
    
    public long getTransactionPrize(){
        return this.transactionPrize;
    }
    
    
    
}
