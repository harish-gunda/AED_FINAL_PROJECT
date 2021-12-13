/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;
import java.util.*;

/**
 *
 * @author harish
 */
public class DistributorOrder extends WorkRequest{
    ArrayList<Product> productList;

    public DistributorOrder() {
        productList = new ArrayList<Product>();
    }
    
    public int totalDistributor(){
        int sum = 0;
        for(Product product: productList){
            sum += product.getDistributorPrice()*product.getQuantity();
        }
        return sum;
    }
    
    public int totalSuperMarket(){
        int sum = 0;
        for(Product product: productList){
            sum += product.getSuperMarketPrice()*product.getQuantity();
        }
        return sum;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    
}
