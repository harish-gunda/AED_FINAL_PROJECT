/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author harish
 */
public class Product {
    private String name;
    private int distributorPrice;
    private int superMarketPrice;
    private int quantity;
    private static int idCount = 1;
    private int id;
    private String description;
    

    public Product(String name, String description) {
        this.name = name;
        this.quantity = 1;
        this.id = idCount;
        this.description = description;
        idCount += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDistributorPrice() {
        return distributorPrice;
    }

    public void setDistributorPrice(int distributorPrice) {
        this.distributorPrice = distributorPrice;
    }

    public int getSuperMarketPrice() {
        return superMarketPrice;
    }

    public void setSuperMarketPrice(int superMarketPrice) {
        this.superMarketPrice = superMarketPrice;
    }

    public static int getIdCount() {
        return idCount;
    }

    public static void setIdCount(int idCount) {
        Product.idCount = idCount;
    }

    
    
    public void addQuantity(){
        quantity = quantity+1;
    }
    
    public void reduceQuantity(){
        quantity -= 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
    
}
