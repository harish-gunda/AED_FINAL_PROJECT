/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this temporarylate file, choose Tools | Templates
 * and open the temporarylate in the editor.
 */
package Business.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SuperMarketEnterprise;
import Business.Enterprise.DistributorEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.WorkQueue.Product;
import Business.WorkQueue.WorkRequest;
import java.util.HashMap;

/**
 *
 * @author medas
 */
public class NetworkAnalytics {
    
        private EcoSystem system;
        
        public NetworkAnalytics(EcoSystem system){
            this.system = system;
        }
    
        public HashMap<String,HashMap<String,Integer>> getAllUsersInNetWorkByOrganization(String networkSelected){
            String temporary;
            HashMap<String,HashMap<String,Integer>> ent = null;
            for(Network network:system.getNetworkList()){
                ent= new HashMap<String,HashMap<String,Integer>>();
                if(networkSelected==null)
                    temporary=system.getNetworkList().get(0).getName();
                else
                    temporary=networkSelected;
                
                for(Enterprise entp:network.getEnterpriseDirectory().getEnterpriseList()){
                    HashMap<String,Integer> org =new HashMap<String,Integer>();
                    org.put("Manager",entp.getEmployeeDirectory().getEmployeeList().size());
                    for(Organization organization: entp.getOrganizationDirectory().getOrganizationList()){
                       org.put(organization.getName(),organization.getUserAccountDirectory().getUserAccountList().size()) ;
                    }
                    ent.put(entp.getEnterpriseType().getValue(),org);
                }

                if(temporary==network.getName())
                    return ent;
            }
            return ent;
        }
        
        public HashMap<String,Integer> getFundsRaised(String networkSelected){
            String temporary="";
            HashMap<String,Integer> ent = null;
            for(Network network:system.getNetworkList()){
                ent = new HashMap<String,Integer>();
                int superMarketProductCount = 0;
                int distributorProductCount = 0;
                for(Enterprise entp:network.getEnterpriseDirectory().getEnterpriseList()){
                    if(entp instanceof SuperMarketEnterprise){
                        for(Product product:entp.getProductList()){
                            superMarketProductCount+=product.getQuantity();
                        }
                    }
                    if(entp instanceof DistributorEnterprise){
                        for(Product product:entp.getProductList()){
                            distributorProductCount+=product.getQuantity();
                        }
                    }
                }
                ent.put("SuperMarket Product Count", superMarketProductCount);
                ent.put("Distributor Product Count", distributorProductCount);
                

                if(temporary==network.getName())
                    return ent;
                }
                return ent;
        }

}
