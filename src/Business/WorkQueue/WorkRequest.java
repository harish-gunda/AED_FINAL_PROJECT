/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;
    private UserAccount sender;
    private Enterprise senderEnterprise;
    private Enterprise receiverEnterprise;
    private Enterprise supplierEnterprise;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Employee customer;
    private UserAccount delivery;

    public UserAccount getDelivery() {
        return delivery;
    }

    public void setDelivery(UserAccount delivery) {
        this.delivery = delivery;
    }
    
    
    
    public Enterprise getSupplierEnterprise() {
        return supplierEnterprise;
    }

    public void setSupplierEnterprise(Enterprise supplierEnterprise) {
        this.supplierEnterprise = supplierEnterprise;
    }
    

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }

    public Employee getCustomer() {
        return customer;
    }

    public void setCustomer(Employee customer) {
        this.customer = customer;
    }

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
    @Override
    public String toString(){
        return sender.getUsername();
    }
}
