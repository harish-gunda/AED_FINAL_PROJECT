/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalesPersonRole;
import Business.Role.SalesSupervisorRole;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class SalesSupervisorOrganisation extends Organization{
    public SalesSupervisorOrganisation() {
        super(Organization.Type.SalesSupervisorOrganisation.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SalesSupervisorRole());
        return roles;
    }
}
