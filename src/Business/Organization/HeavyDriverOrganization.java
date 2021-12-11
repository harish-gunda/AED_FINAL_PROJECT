/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.HeavyDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class HeavyDriverOrganization extends Organization{
    
    public HeavyDriverOrganization() {
        super(Organization.Type.HeavyDriver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new HeavyDriverRole());
        return roles;
    }
    
}
