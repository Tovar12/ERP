/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package erp;

/**
 *
 * @author Felipe
 */
public class Provider {
    private String providerName;
    private long telephoneNumber;
    private String address;
    
    public Provider(){
        
    }

    public void setProviderName(String providerName){
        this.providerName = providerName;
    }
    
    public String getProviderName(){
        return this.providerName;
    }
    
    public void setTelephoneNumber(long telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    
    public long getTelephoneNumber(){
        return this.telephoneNumber;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getAddress(){
        return this.address;
    }
       
}
