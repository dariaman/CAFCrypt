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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dariaman.siagian
 */
@Entity
@Table(name = "policy_cc")
@XmlRootElement
public class PolicyCCModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "policy_cc_id")
    private Integer PolicyCcID;
    
    @Column(name = "policy_id")
    private Integer PolicyID;
    
    @Column(name = "status")
    private Integer Status;
    
    @Column(name = "acquirer_bank_id")
    private Integer AcquirerBankID;
    
    @Column(name = "card_bank_issuer_id")
    private Integer CardBankIssuerID;
    
    @Column(name = "cc_no")
    private String CCNo;

    public Integer getPolicyCcID() {
        return PolicyCcID;
    }

    public Integer getPolicyID() {
        return PolicyID;
    }

    public Integer getStatus() {
        return Status;
    }

    public Integer getAcquirerBankID() {
        return AcquirerBankID;
    }

    public Integer getCardBankIssuerID() {
        return CardBankIssuerID;
    }

    public String getCCNo() {
        return CCNo;
    }

    public void setCCNo(String CCNo) {
        this.CCNo = CCNo;
    }
}
