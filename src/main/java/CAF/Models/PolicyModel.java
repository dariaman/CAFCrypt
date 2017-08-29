/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "policy")
public class PolicyModel implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_id")
    private int PolicyID;
    
    @Column(name = "policy_no")
    private String PolicyNo;
    
    @Column(name = "policy_holder_id")
    private int HolderID;
    
    @Column(name = "policy_payment_method")
    private String PaymentMethod;

    public void setPolicyNo(String PolicyNo) {
        this.PolicyNo = PolicyNo;
    }

    public int getPolicyID() {
        return PolicyID;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }

    public int getHolderID() {
        return HolderID;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }
}
