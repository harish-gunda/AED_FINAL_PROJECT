/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        
        if (type.getValue().equals(Type.SalesPerson.getValue())){
            organization = new SalesPersonOrganisation();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.HeavyDriver.getValue())){
            organization = new HeavyDriverOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CareTaker.getValue())){
            organization = new CareTakerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.CustomerOrganization.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.LightDriver.getValue())){
            organization = new LightDriverOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}