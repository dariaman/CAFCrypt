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

/**
 *
 * @author dariaman.siagian
 */
@Entity
@Table(name = "policy_cc")
public class PolicyCCModel implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_cc_id")
    private int PolicyCCID;
    
    @Column(name = "policy_id")
    private int PolicyID;
    
    @Column(name = "status")
    private int Status;
    
    @Column(name = "cc_no")
    private String CCNo;
    
    @Column(name = "card_bank_issuer_id")
    private int BankIssuerID;

    public int getPolicyCCID() {
        return PolicyCCID;
    }

    public int getPolicyID() {
        return PolicyID;
    }

    public int getStatus() {
        return Status;
    }

    public String getCCNo() {
        return CCNo;
    }

    public int getBankIssuerID() {
        return BankIssuerID;
    }
    
    
    
}
