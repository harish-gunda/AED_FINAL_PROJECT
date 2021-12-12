/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DistributorAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author riddhimedakkar
 */
 public class CustomerAdmin extends Organization{
    public CustomerAdmin() {
        super(Organization.Type.CustomerAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorAdminRole());
        return roles;
    }
}

