/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dariaman.siagian
 */
@MappedSuperclass
@Table(name = "policy_ac")
@XmlRootElement
public class PolicyAc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "policy_ac_id")
    private Integer policyAcId;
    @Column(name = "policy_id")
    private Integer policyId;
    @Column(name = "status")
    private Integer status;
    @Column(name = "cycle_date")
    private Integer cycleDate;
    @Column(name = "bank_id")
    private Integer bankId;
    @Size(max = 16)
    @Column(name = "acc_no")
    private String accNo;
    @Size(max = 30)
    @Column(name = "acc_name")
    private String accName;
    @Size(max = 90)
    @Column(name = "bank_branch")
    private String bankBranch;
    @Column(name = "created_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDt;
    @Column(name = "SKDR_status")
    private Integer sKDRstatus;

    public PolicyAc() {
    }

    public PolicyAc(Integer policyAcId) {
        this.policyAcId = policyAcId;
    }

    public Integer getPolicyAcId() {
        return policyAcId;
    }

    public void setPolicyAcId(Integer policyAcId) {
        this.policyAcId = policyAcId;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCycleDate() {
        return cycleDate;
    }

    public void setCycleDate(Integer cycleDate) {
        this.cycleDate = cycleDate;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public Date getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Date createdDt) {
        this.createdDt = createdDt;
    }

    public Integer getSKDRstatus() {
        return sKDRstatus;
    }

    public void setSKDRstatus(Integer sKDRstatus) {
        this.sKDRstatus = sKDRstatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (policyAcId != null ? policyAcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PolicyAc)) {
            return false;
        }
        PolicyAc other = (PolicyAc) object;
        if ((this.policyAcId == null && other.policyAcId != null) || (this.policyAcId != null && !this.policyAcId.equals(other.policyAcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CAF.Models.PolicyAc[ policyAcId=" + policyAcId + " ]";
    }
    
}
