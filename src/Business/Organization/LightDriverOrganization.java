/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.LightDriverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harish
 */
public class LightDriverOrganization extends Organization{
    
    public LightDriverOrganization() {
        super(Organization.Type.LightDriver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LightDriverRole());
        return roles;
    }
}
