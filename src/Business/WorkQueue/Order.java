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
public class Order extends WorkRequest{
    ArrayList<Product> productList;

    public Order() {
        productList = new ArrayList<Product>();
    }
    
    public int total(){
        int sum = 0;
        for(Product product: productList){
            sum += product.getPrice()*product.getQuantity();
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
