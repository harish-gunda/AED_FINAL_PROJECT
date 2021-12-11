/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class SupplierEnterprise extends Enterprise{
    
    public SupplierEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Supplier);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}

