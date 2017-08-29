/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CAF.Models.Dao;

import CAF.Models.PolicyModel;
import java.util.List;

/**
 *
 * @author dariaman.siagian
 */
public interface PolicyDao {
    public List<PolicyModel> getListPolicy();    
    public int findPolicyIDByPolicyNo(String PolicyNo);
    public PolicyModel findPolicyByPolicyNo(String PolicyNo);
    public PolicyModel findPolicyByPolicyID(int PolicyID);
}
