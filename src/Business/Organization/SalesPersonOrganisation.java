/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesPersonRole;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class SalesPersonOrganisation extends Organization{
    public SalesPersonOrganisation() {
        super(Organization.Type.SalesPerson.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesPersonRole());
        return roles;
    }
}
